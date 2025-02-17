package com.adarsh.data;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
@ComponentScan
@EntityScan(basePackages = {"com.adarsh.data.entity"})
public class EnableDataAutoConfiguration {
}
