package com.jjh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@Profile("dev")
@PropertySource("classpath:dev-myprops.properties")
public class DevAppConfig {

	@Autowired
	Environment env;
	
	@Bean
	public String name() {
		return "John Dev";
	}
	
	@Bean
	public String info() {
		return env.getProperty("foo");
	}

}
