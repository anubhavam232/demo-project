package com.scaler.demo.project.config;

import com.scaler.demo.project.service.UserService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringBeanConfig {
    @Bean
    public UserService getUserService(){
        return new UserService();
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }
}
