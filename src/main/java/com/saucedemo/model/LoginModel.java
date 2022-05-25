package com.saucedemo.model;

public class LoginModel {

    String username, password;

    // Constructor
    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
