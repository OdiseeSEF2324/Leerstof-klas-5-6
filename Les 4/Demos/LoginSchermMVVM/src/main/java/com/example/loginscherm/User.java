package com.example.loginscherm;

/**
 * Klasse om user-gegevens bij te houden
 * deze moet niet getest worden want er staan enkel getters en setters in
 */
public class User {

    private String password;
    private String username;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public User(String password, String voornaam) {
        this.password = password;
        this.username = voornaam;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
