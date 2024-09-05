package com.scaler.demo.project.config;

import com.scaler.demo.project.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
