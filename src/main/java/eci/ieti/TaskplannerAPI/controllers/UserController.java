package eci.ieti.taskplannerapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eci.ieti.taskplannerapi.entities.User;
import eci.ieti.taskplannerapi.services.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping("/users")
    public User createNewUser(@RequestBody User newUser) {
        return userService.create(newUser);
    }

    // Single item

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getById(Long.toString(id));
    }

    @PutMapping("/users")
    public User replaceUser(@RequestBody User newUser) {
        return userService.update(newUser);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.remove(Long.toString(id));
    }

}
