package dev.kishoremenda.microservices.order.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI orderServiceAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order Service API")
                        .description("This is the REST API for the Order Service")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("You can refer to the Order Service documentation here")
                        .url("https://Order-service-dummy-url.com/docs"));
    }
}

