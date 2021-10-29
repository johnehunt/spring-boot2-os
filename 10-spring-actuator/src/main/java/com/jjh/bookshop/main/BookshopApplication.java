package com.jjh.bookshop.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// To turn off security for actuator need to use
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class})


@SpringBootApplication
@ComponentScan(basePackages = {
		"com.jjh.bookshop.controller",
		"com.jjh.bookshop.service"})
public class BookshopApplication {

	public static void main(String[] args) {
		System.out.println("Starting Bookshop setup");
		SpringApplication.run(BookshopApplication.class, args);
		System.out.println("Setup finished");
		System.out.println("Url to try with Actuator:");
		System.out.println("\t - http://localhost:8080/actuator/health");
		System.out.println("You will need to login for:");
		System.out.println("\t - http://localhost:8080/actuator");
		System.out.println("GET operations:");
		System.out.println("\t - localhost:8080/bookshop/list");
		System.out.println("\t - localhost:8080/bookshop/1");
	}

}

/**
 * Post - localhost:8080/bookshop
 * Body - {"isbn": 321, "author": "Billy Smith", "title": "The way home", "price": 12.33}
 *
 *
 * Delete - localhost:8080/bookshop/1
 **/

/**
 * Can shut down using curl -X POST localhost:port/actuator/shutdown
 */