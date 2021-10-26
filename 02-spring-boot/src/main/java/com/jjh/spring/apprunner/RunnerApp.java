package com.jjh.spring.apprunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerApp implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(RunnerApp.class, args);
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationArguments: ");
        for (String name : args.getOptionNames()) {
            System.out.println(name + "  - " + args.getOptionValues(name));
        }
    }
}
