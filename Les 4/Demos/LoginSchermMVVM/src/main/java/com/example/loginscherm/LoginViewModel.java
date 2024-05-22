package com.example.loginscherm;

public class LoginViewModel {

    private Model model = new Model();

    /**
     * Returns the user when username and password matches a user, otherwise false
     * @param username username of the user
     * @param password password of the user
     * @return the user object matching the username and password
     */
    public User login(String username, String password){
        for (User u: model.getAllUsers()) {
            if(u.getUsername() == username && u.getPassword() == password) {
                return u;
            }
        }

        return null;
    }

    /**
     * voeg de nieuwe gebruiker toe als de naam nog niet bestaat
     * @param username
     * @param password
     * @return boolean: true als de user toegevoegd is, anders false
     */
    public boolean registreer(String username, String password){
        // controleer of de user reeds bestaat
        for (User u: model.getAllUsers()) {
            if(u.getUsername() == username) {
                return false;
            }
        }

        // voeg de user toe
        User user = new User(password, username);
        return model.addUser(user);
    }
}
