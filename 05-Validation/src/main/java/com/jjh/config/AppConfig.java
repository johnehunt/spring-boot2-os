package com.jjh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;

@Configuration
public class AppConfig {
    @Bean(name = "validator")
    public Validator getValidator() {
        return Validation.buildDefaultValidatorFactory().getValidator();
    }
}
