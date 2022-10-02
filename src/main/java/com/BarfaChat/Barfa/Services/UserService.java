package com.BarfaChat.Barfa.Services;

import com.BarfaChat.Barfa.Models.Response;
import com.BarfaChat.Barfa.Models.User;
import com.BarfaChat.Barfa.Models.UserLogin;
import com.BarfaChat.Barfa.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

  public Response login(UserLogin userLogin) {
    Response response = new Response();
    User user = userRepository.findByUsername(userLogin.getUserName());
    if (user != null) {
      if (user.getPassword().equals(userLogin.getPassword())) {
        response.setResponse("Login Success");
      } else response.setResponse("Password is not correct");
    } else {
      response.setResponse("Username is not found");
    }
    return response;
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }

  public void updateUser(Long userId, User user) {
    User user1 =
        userRepository
            .findById(userId)
            .orElseThrow(
                () -> new IllegalStateException("User with id " + userId + " does not exist"));
    if (user.getFirstName() != null
        && user.getFirstName().length() > 0
        && !Objects.equals(user1.getFirstName(), user.getFirstName())) {
      user1.setFirstName(user.getFirstName());
    }
    if (user.getLastName() != null
        && user.getLastName().length() > 0
        && !Objects.equals(user1.getLastName(), user.getLastName())) {
      user1.setLastName(user.getLastName());
    }
    if (user.getEmail() != null
        && user.getEmail().length() > 0
        && !Objects.equals(user1.getEmail(), user.getEmail())) {
      user1.setEmail(user.getEmail());
    }
    if (user.getUsername() != null
        && user.getUsername().length() > 0
        && !Objects.equals(user1.getUsername(), user.getUsername())) {
      user1.setUsername(user.getUsername());
    }
    if (user.getPassword() != null
        && user.getPassword().length() > 0
        && !Objects.equals(user1.getPassword(), user.getPassword())) {
      user1.setPassword(user.getPassword());
    }
    userRepository.save(user1);
  }
}
