package com.example.loginscherm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    void addUser_whenEmpty_UserAdded() {
        // arrange
        Model model = new Model();
        User user = new User("test", "test");

        // act
        model.addUser(user);

        // assert
        assertEquals(1, model.getAllUsers().size());
    }

    @Test
    void addUser_whenNotEmpty_UserAdded() {
        // arrange
        Model model = new Model();
        User user = new User("test", "test");
        model.addUser(user);

        // act
        model.addUser(user);

        // assert
        assertEquals(2, model.getAllUsers().size());
    }
}