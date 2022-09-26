package com.BarfaChat.Barfa.Models;

public class UserLogin {
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    private String userName;
    private String password;
}
