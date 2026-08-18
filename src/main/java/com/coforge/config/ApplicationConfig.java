package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Department;

@Configuration
public class ApplicationConfig {

    @Bean
    public Department department() {

        return new Department();
    }
}