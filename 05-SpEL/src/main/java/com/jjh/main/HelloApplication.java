package com.jjh.main;

import com.jjh.beans.AddressService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloApplication.class, args);

		System.out.println("Main - obtaining DriverManagerDataSource");
		AddressService service = context.getBean(AddressService.class);
		System.out.println(service.getAddress(0));
		System.out.println("Done");
	}

}
