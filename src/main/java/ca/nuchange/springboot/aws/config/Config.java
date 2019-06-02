package ca.nuchange.springboot.aws.config;

import ca.nuchange.springboot.aws.models.Bar;
import ca.nuchange.springboot.aws.models.Foo;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionType;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Function;

@EnableConfigurationProperties(Properties.class)
public class Config implements ApplicationContextInitializer<GenericApplicationContext> {

    private Properties props;

    public Config() {
    }

    public Config(Properties props) {
        this.props = props;
    }

    @Bean
    public Function<Foo, Bar> function() {
        return value -> new Bar(
                value.uppercase() + (this.props.getFoo() != null ? "-" + this.props
                        .getFoo() : ""));
    }

    @Override
    public void initialize(GenericApplicationContext context) {
        Properties properties = new Properties();
        this.props = properties;
        context.registerBean(Properties.class, () -> properties);
        context.registerBean("function", FunctionRegistration.class,
                () -> new FunctionRegistration<Function<Foo, Bar>>(function())
                        .type(FunctionType.from(Foo.class).to(Bar.class).getType()));
    }
}
