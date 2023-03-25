package com.stempien.biblioteczka;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField txtUser;
    public TextField txtPassword;

    @FXML
    protected void onButtonClick() {
        String password = txtPassword.getText();
        String login = txtUser.getText();
        if(login.equals("Bob") && password.equals("Bob")){

        }
    }
}