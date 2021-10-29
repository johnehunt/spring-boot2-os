package com.jjh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    	System.out.println("Starting the web application");
        SpringApplication.run(Application.class, args);
        System.out.println("Startup complete");
        System.out.println("\thttp://localhost:8080/users/list");
        System.out.println("\thttp://localhost:8080/users/user/john");
    }
}
