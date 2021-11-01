package com.jjh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@Profile("test")
@PropertySource("classpath:test-myprops.properties")
public class TestAppConfig {

	@Autowired
	Environment env;
	
	@Bean
	public String name() {
		return "John Test";
	}

}
