package com.jjh.spring.cmdline;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    public void run(String... args) {
        System.out.println("args: ");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("-----------------");
    }
}
