package com.adarsh.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EnableServiceAutoConfiguration {


    @Bean
    public void createBean() {
        System.out.println("Create Bean");
    }
}
