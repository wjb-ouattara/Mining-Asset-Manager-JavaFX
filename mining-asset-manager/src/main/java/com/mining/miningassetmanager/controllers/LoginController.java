package com.mining.miningassetmanager.controllers;
import javafx.fxml.FXML;
import  javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField emailField;
    @FXML
    private  PasswordField passwordField;
    @FXML
    private void handleLogin(){
        String email= emailField.getText();
        String password= passwordField.getText();
        System.out.println("Login attemp:" + email + " / "+ password);

        // Plus tard :
        // - vérifier dans la BD
        // - rediriger vers le dashboard
    }
}
