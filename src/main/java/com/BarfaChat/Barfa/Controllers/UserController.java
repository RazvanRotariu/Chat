package com.BarfaChat.Barfa.Controllers;
import com.BarfaChat.Barfa.Models.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/User")
public class UserController {
    @PostMapping
    public void getUser(@RequestBody User user){
    }
}
