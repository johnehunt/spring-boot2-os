package com.jjh.beans;

import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

@Component
public class Employee {
    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(18)
    @Max(65)
    private int age;

    @AssertTrue
    private boolean enabled = true;

    @Email(message = "Email should be valid")
    private String email;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enabled=" + enabled +
                ", email='" + email + '\'' +
                '}';
    }
}
