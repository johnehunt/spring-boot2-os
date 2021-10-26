package com.jjh.spring.fluent;


import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .sources(App2.class)
                .logStartupInfo(false)
                .profiles("prod") // can specify a profile if required
                .run(args);
    }
}
