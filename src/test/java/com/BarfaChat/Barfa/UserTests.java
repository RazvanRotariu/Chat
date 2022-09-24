package com.BarfaChat.Barfa;

import com.BarfaChat.Barfa.Models.User;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Objects;

public class UserTests {

    @Test
    public void AddUserTest() {
        User user = new User("test", "test", "test", "test","test");
        Assert.isTrue(Objects.equals(user.getEmail(), "test"),"Email Not Ok!");
        Assert.isTrue(Objects.equals(user.getFirstName(), "test"),"FirstName Not Ok!");
        Assert.isTrue(Objects.equals(user.getLastName(), "test"),"LastName Not Ok!");
        Assert.isTrue(Objects.equals(user.getUsername(), "test"),"Username Not Ok!");
        Assert.isTrue(Objects.equals(user.getPassword(), "test"),"Password Not Ok!");
    }
}
