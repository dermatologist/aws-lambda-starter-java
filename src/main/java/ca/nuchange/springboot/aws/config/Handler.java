package ca.nuchange.springboot.aws.config;

import ca.nuchange.springboot.aws.models.Bar;
import ca.nuchange.springboot.aws.models.Foo;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class Handler extends SpringBootRequestHandler<Foo, Bar> {
}
