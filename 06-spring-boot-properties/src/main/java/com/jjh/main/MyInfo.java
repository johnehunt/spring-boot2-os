package com.jjh.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyInfo {
	
	@Value("${spring.application.name}")
	public String appName;
	@Value("${spring.config.name}")
	String configName;

	@Value("${spring.application.admin.enabled}")
	public String adminEnabled;
	@Value("${spring.main.banner-mode}")
	public String bannerMode;

	@Autowired
	private ApplicationContext applicationContext;

	public String getId() {
		return this.applicationContext.getId();
	}

	@Autowired
	private Environment env;

	public String getConfigName() {
		return this.env.getProperty("spring.config.name");
	}

}
