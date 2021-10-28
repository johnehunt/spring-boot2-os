package com.jjh.main;

import com.jjh.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import java.util.Set;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jjh.config", "com.jjh.beans"})
public class App {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx
                     = SpringApplication.run(App.class, args)) {
            Employee bean = ctx.getBean(Employee.class);
            System.out.println(bean);

            Validator validator = ctx.getBean("validator", Validator.class);
            Set<ConstraintViolation<Employee>> errors = validator.validate(bean);
            errors.forEach(System.out::println);
        }
    }
}
