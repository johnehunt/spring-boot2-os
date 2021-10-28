package com.jjh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class PropertiesApp {

	
	public static void main(String [] args) {
		System.out.println("Starting");
		ApplicationContext ctx = SpringApplication.run(PropertiesApp.class, args);

		MyInfo info = ctx.getBean(MyInfo.class);
		System.out.println("info.appName: " + info.appName);
		System.out.println("info.configName: " + info.configName);
		System.out.println("info.adminEnabled: " + info.adminEnabled);
		System.out.println("info.bannerMode: " + info.bannerMode);
		System.out.println("info.getConfigLocation(): " + info.getConfigName());
		System.out.println("info.getId(): " + info.getId());

		System.out.println("--------------");
		
		MyAppProperties myAppsProps = ctx.getBean(MyAppProperties.class);
		System.out.println("myAppsProps.getName(): " + myAppsProps.getName());
		System.out.println("myAppsProps.getDescription(): " + myAppsProps.getDescription());
		
		System.out.println("Done");
	}

}
