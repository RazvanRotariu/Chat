package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/User")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void getUser(@RequestBody User user) {
        System.out.println(user.getEmail() + "|" + user.getFirstName() + "|" + user.getLastName() + "|" + user.getUsername());
    }

    @GetMapping
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
