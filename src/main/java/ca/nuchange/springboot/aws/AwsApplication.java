package ca.nuchange.springboot.aws;

import ca.nuchange.springboot.aws.config.Properties;
import ca.nuchange.springboot.aws.models.Bar;
import ca.nuchange.springboot.aws.models.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class AwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsApplication.class, args);
    }

}
