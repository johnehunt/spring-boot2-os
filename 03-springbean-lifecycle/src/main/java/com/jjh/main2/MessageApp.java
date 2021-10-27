package com.jjh.main2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MessageApp {

    public static void main(String[] args) {
        System.out.println("Main - obtaining Application Context");
        ConfigurableApplicationContext context = SpringApplication.run(MessageApp.class, args);
        MessageService ms = context.getBean(MessageService.class);
        System.out.println(ms);
        context.close();
        System.out.println("Done");
    }
}
