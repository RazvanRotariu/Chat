package com.BarfaChat.Barfa.Controllers;

import com.BarfaChat.Barfa.Models.UserLogin;
import com.BarfaChat.Barfa.Models.Response;
import com.BarfaChat.Barfa.Services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/Auth")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;
    @PostMapping()
    public Response Login(@RequestBody UserLogin userLogin){
        return userService.login(userLogin);
    }


}
