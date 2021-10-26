package com.jjh.spring.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        // Note the change - no SpringApplication.run()
        SpringApplication app = new SpringApplication(App.class);
        app.setBanner(new MyBanner());
        app.setLogStartupInfo(false); // stops default log info
        app.run(args);
    }
}

class MyBanner implements Banner {
    public void printBanner(Environment environment,
                            Class<?> sourceClass,
                            PrintStream out) {
        out.println("---------------------");
        out.println("  My Custom Banner");
        out.println("---------------------");
    }
}

