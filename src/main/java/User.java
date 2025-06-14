package org.example;

public class User {
    private String email;
    private String phone;
    private String social;
    private String username;

    private String password;

    // Конструктор для регистрации по email
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Конструктор для регистрации по телефону
    public User(String username, String phone, String password, boolean byPhone) {
        this.username = username;
        this.phone = phone;
        this.password = password;
    }

    // Конструктор для регистрации через соцсеть
    public User(String username, String socialProvider) {
        this.username = username;
        this.social = socialProvider;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSocial() {
        return social;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



