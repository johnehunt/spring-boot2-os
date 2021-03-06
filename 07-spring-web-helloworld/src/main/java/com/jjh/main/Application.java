package com.jjh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jjh.controller")
public class Application {
    public static void main(String[] args) {
    	System.out.println("Starting the web application");
        SpringApplication.run(Application.class, args);
        System.out.println("Server Startup complete");
        System.out.println("\tSee - http://localhost:8080/welcome/hello");
        System.out.println("\tSee - http://localhost:8080/welcome/help");
    }
}
