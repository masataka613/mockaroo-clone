package com.example.demo.model;

public class UserData {

    private String lastName;
    private String firstName;
    private String password;

    public UserData(String lastName, String firstName, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }
}