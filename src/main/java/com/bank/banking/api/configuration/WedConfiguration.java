package com.bank.banking.api.configuration;

import com.bank.banking.api.Service.UserService;
import com.bank.banking.api.Service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WedConfiguration {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean(name="myUserService")
    public UserService myUserService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserService UserServiceByName() {
        return new UserServiceImpl();
    }
}
