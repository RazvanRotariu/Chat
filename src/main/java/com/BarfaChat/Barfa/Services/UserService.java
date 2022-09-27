package com.BarfaChat.Barfa.Services;

import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Models.UserLogin;
import com.BarfaChat.Barfa.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    public String loadUserByUsername(String userName) {
        if (userName == null || userName.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        User user = userRepository.findByUsername(userName);
        if (user != null) {
            return user.toCurrentUserDetails();
        }
        throw new IllegalArgumentException("Username is not Found!");
    }

  public List<User> findAll() {
    return userRepository.findAll();
  }

    public void PostUser(User user) {
        userRepository.save(user);
    }
}