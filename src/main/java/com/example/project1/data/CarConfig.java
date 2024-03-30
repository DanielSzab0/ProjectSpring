package com.example.project1.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public Car getFord() {
        return new Ford();
    }

    @Bean
    public Car getBmw() {
        return new Bmw();
    }
}
