package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/User")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping
  public void getUser(@RequestBody User user) {
    userService.PostUser(user);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<User> getUser() {
    return userService.findAll();
  }

  @DeleteMapping(path = "{userId}")
  public void deleteUser(@PathVariable("userId") Long userId) {
    userService.deleteUser(userId);
  }

  @PutMapping(path = "{userId}")
  public void updateUser(@PathVariable("userId") Long userId, @RequestBody User user) {
    userService.updateUser(userId, user);
  }
}
