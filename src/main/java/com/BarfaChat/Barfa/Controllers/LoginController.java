package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Models.UserLogin;
import com.BarfaChat.Barfa.Services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/Auth")
public class LoginController {
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;
    @GetMapping()
    public String Login(@RequestBody UserLogin userLogin){
        return userService.login(userLogin);
    }


}
