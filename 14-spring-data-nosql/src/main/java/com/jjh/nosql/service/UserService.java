package com.jjh.nosql.service;

import com.jjh.nosql.domain.User;
import com.jjh.nosql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    private UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    public UserService() {
        System.out.println("UserService.<init>()");
    }

    public void addUser(User user) {
        System.out.println("UserService.addUser(" + user + ")");
        repository.save(user);
    }

    public List<User> getAllUsers() {
        System.out.println("UsershopService.getAllUsers()");
        return repository.findAll();
    }

    public void updateUser(User newVersionOfUser) {
        System.out.println("UsershopService.updateUser(" + newVersionOfUser + ")");
        repository.save(newVersionOfUser);
    }

    public void deleteUser(String id) {
        System.out.println("UsershopService.deleteUser(" + id + ")");
        repository.deleteById(id);
    }

    public User getUser(String id) {
        System.out.println("UsershopService.getUser(" + id + ")");
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.orElseThrow(() -> new UserNotFoundException("Couldn't find a Dog with id: " + id));
    }

    public List<User> getUsersByName(String name) {
        System.out.println("UsershopService.getUserByName(" + name + ")");
        List<User> users = repository.findUsersByName(name);
        return users;
    }

}
