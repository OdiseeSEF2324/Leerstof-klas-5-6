package com.example.loginscherm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginViewModelTest {

    @Test
    void login() {
    }

    @Test
    void registreer_firstUser_returnsTrue() {
        // arrange
        LoginViewModel viewmodel = new LoginViewModel();

        // act
        boolean result = viewmodel.registreer("jens", "test");

        // assert
        assertTrue(result);
    }

    @Test
    void registreer_twoDifferentUsers_returnsTrueForSecondUser() {
        // arrange
        LoginViewModel viewmodel = new LoginViewModel();
        viewmodel.registreer("jens2", "test");

        // act
        boolean result = viewmodel.registreer("jens", "test");

        // assert
        assertTrue(result);
    }

    @Test
    void registreer_twoIdenticalUsers_returnsFalseForSecondUser() {
        // arrange
        LoginViewModel viewmodel = new LoginViewModel();
        viewmodel.registreer("jens", "test");

        // act
        boolean result = viewmodel.registreer("jens", "test");

        // assert
        assertFalse(result);
    }
}