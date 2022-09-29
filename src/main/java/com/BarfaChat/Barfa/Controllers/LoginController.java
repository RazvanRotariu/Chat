//package com.springboot.blog.controller;
//import com.BarfaChat.Barfa.Repositories.UserRepository;
//import com.springboot.blog.entity.Role;
//import com.springboot.blog.entity.User;
//import com.springboot.blog.payload.LoginDto;
//import com.springboot.blog.payload.SignUpDto;
//import com.springboot.blog.repository.RoleRepository;
//import com.springboot.blog.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//package com.springboot.blog.payload;
//import lombok.Data;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collections;
//


//@Data
//public class LoginDto {
//    private String usernameOrEmail;
//    private String password;
//}
//
//@RestController
//@RequestMapping("/api/auth")
//public class LoginController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepoitory roleRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                loginDto.getUsernameOrEmail(), loginDto.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
//    }
//}