package com.mycompany.clinica;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblMessage;

    @FXML
    private void handleLogin() {
        String user = txtUsername.getText();
        String pass = txtPassword.getText();

        // Ejemplo simple: usuario y contraseña fijos
        if ("admin".equals(user) && "1234".equals(pass)) {
            lblMessage.setText("Login correcto!");
            // Aquí luego cambiarías a la pantalla principal de la app
        } else {
            lblMessage.setText("Usuario o contraseña incorrectos");
        }
    }
}
