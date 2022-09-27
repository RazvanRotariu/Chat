package com.BarfaChat.Barfa.Controllers;
import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Repositories.UserRepository;
import com.BarfaChat.Barfa.Services.UserService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/User")
public class UserController {
    @PostMapping
    public void getUser(@RequestBody User user){
        System.out.println(user.getEmail()+"|"+user.getFirstName()+"|"+user.getLastName()+"|"+user.getUsername());
    }
    public UserController(UserService userService) {
        this.userService= userService;
    }
    private final UserService userService;
    public List<User> getUser(){
        return userService.findAll();
    }
}
