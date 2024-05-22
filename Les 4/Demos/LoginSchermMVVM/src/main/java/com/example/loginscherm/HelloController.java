package com.example.loginscherm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPass;
    @FXML
    private TextField regVoornaam;
    @FXML
    private TextField regAchternaam;
    @FXML
    private TextField regEmail;
    @FXML
    private TextField regPass;
    @FXML
    private TextField regPassConfirm;
    @FXML
    private RadioButton regGeslachtMan;
    @FXML
    private RadioButton regGeslachtVrouw;
    @FXML
    private ComboBox regRol; // Let op voor de options -> kijk naar de fxml

    private LoginViewModel viewModel = new LoginViewModel();

     public void cancelLogin(ActionEvent actionEvent) {
        txtUsername.setText("");
        txtPass.setText("");
    }

    public void cancelRegistration(ActionEvent actionEvent){
         regVoornaam.setText("");
         regAchternaam.setText("");
         regEmail.setText("");
         regPass.setText("");
         regPassConfirm.setText("");
         regGeslachtMan.setSelected(false);
         regGeslachtVrouw.setSelected(false);
         regRol.setValue(null);
    }

    public void loginUser(ActionEvent actionEvent) {
    }

    public void registreer(ActionEvent actionEvent) {
         // eventueel hier een check doen of regPass == regPassConfirm
        viewModel.registreer(regVoornaam.getText(), regPass.getText());
    }
}