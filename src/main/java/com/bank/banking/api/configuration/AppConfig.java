package com.bank.banking.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RandomIdGenerator randomIdGenerator() {
        return new RandomIdGenerator();
    }
}
