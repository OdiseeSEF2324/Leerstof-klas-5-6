package com.example.loginscherm;

import java.util.ArrayList;

/**
 * Deze klasse beheert alle users
 */
public class Model {

    private ArrayList<User> users = new ArrayList<User>();

    // CRUD operaties
    public ArrayList<User> getAllUsers(){
        return users;
    }

    /**
     * Functie om een user toe te voegen aan de database
     * @param user de user om toe te voegen
     */
    public boolean addUser(User user){
        users.add(user);
        return true;
    }


}
