package com.adarsh.web;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class EnableWebAutoConfiguration {

    @EventListener(ServletWebServerInitializedEvent.class)
    public void applicationStart(ServletWebServerInitializedEvent event) {
        int port = event.getWebServer().getPort();
        ConfigurableEnvironment environment = event.getApplicationContext().getEnvironment();
        System.out.println("=================================================================================");
        System.out.println("                                                                               ");
        System.out.printf("     Server started on port: %d and active profile: %s                          %n",
                port, Arrays.toString(environment.getActiveProfiles()));
        System.out.printf("     Swagger URL - http://localhost:%d/swagger-ui.html                          %n", port);
        System.out.println("                                                                               ");
        System.out.println("=================================================================================");
    }

    @Bean
    public OpenAPI reportApi() {
        OpenAPI openAPI = new OpenAPI()
                .info(new Info().title("User Manager")
                        .version("v0.0.1")
                );

        openAPI.servers(List.of(new Server().url("http://localhost:8080")));

        return openAPI;
    }
}
