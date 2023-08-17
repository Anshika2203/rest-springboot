package com.test.restspringboot.controller;


import com.test.restspringboot.model.User;
import org.springframework.web.bind.annotation.*;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/user")
public class APIService {

    @Autowired
    private Datastore datastore;

    @GetMapping("{userId}")
    public User getUserDetails(@PathVariable String userId) {
        return datastore.find(User.class, "userId", userId).get();
    }

    @PostMapping
    public String createUserDetails(@RequestBody User user) {
        datastore.save(user);
        return "User created successfully";
    }

    @PutMapping
    public String updateUserDetails(@RequestBody User user) {
        datastore.save(user);
        return "User updated successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails(@PathVariable String userId) {
        datastore.delete(User.class, userId);
        return "User deleted successfully";
    }
}
