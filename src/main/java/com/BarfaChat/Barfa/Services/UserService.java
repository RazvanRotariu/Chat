package com.BarfaChat.Barfa.Services;

import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Models.UserLogin;
import com.BarfaChat.Barfa.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
//public class UserService implements UserService {
//    UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        super();
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserLogin loadUserByUsername(String userName) throws UsernameNotFoundException {
//        if (userName == null || userName.isEmpty()) {
//            throw new UsernameNotFoundException("Username is Empty");
//        }
//
//        User user = userRepository.findBy(userName);
//        if (user != null) {
//            return user.toCurrentUserDetails();
//        }
//        throw new UsernameNotFoundException(userName + "is not found !!!");
//    }
//}