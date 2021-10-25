package com.jjh.nosql.main;

import com.jjh.nosql.domain.User;
import com.jjh.nosql.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        System.out.println("Starting Main Application!");
        ConfigurableApplicationContext context = null;
        try {
            System.out.println("Starting Student Repo setup");
            context = SpringApplication.run(MainApp.class, args);
            System.out.println("Setup finished");

            UserService service = context.getBean(UserService.class);

            User user = new User("123", 21, "dnd@mymail.com");
            service.addUser(user);

            List<User> users = service.getAllUsers();
            System.out.println(users);

            for (User u : users) {
               service.deleteUser(u.getId());
            }


        } finally {
            // Need to close as it is a 'resource loader'
            if (context != null)
                context.close();
        }
        System.out.println("Exiting Main Application!");
    }

}
