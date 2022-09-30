package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/User")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public void getUser(@RequestBody User user) {
    userService.PostUser(user);
  }

  @GetMapping
  public List<User> getUser() {
    return userService.findAll();
  }
}
