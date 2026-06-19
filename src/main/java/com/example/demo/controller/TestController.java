package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserData;
import com.github.javafaker.Faker;

@RestController
public class TestController {

    @GetMapping("/test")
    public List<UserData> test() {

    	Faker faker = new Faker(Locale.JAPAN);

        List<UserData> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

        	String lastName = faker.name().lastName();
        	String firstName = faker.name().firstName();
            String password = faker.internet().password();

            users.add(new UserData(lastName, firstName, password));
        }

        return users;
    }
}