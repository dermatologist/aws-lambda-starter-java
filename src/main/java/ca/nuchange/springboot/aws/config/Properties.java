package ca.nuchange.springboot.aws.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

// @checkstyle:off
@ConfigurationProperties("app")
public class Properties {
    public String foo;

    public String getFoo() {
        return this.foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

}


// @checkstyle:on