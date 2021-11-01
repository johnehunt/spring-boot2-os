package com.jjh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@Profile("prod")
@PropertySource("classpath:prod-myprops.properties")
public class ProdAppConfig {

	@Autowired
	Environment env;

	@Bean
	public String name() {
		return "John Prod";
	}

}
