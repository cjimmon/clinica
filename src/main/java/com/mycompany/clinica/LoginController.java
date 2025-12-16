package com.mycompany.clinica;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    if ("1".equals(user) && "1".equals(pass)) {
        lblMessage.setText("Login correcto!");

        try {
            // Cargar MainView.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/clinica/MainView.fxml"));
            Parent root = loader.load();

            // Obtener la ventana actual
            Stage stage = (Stage) btnLogin.getScene().getWindow();

            // Cambiar la escena a MainView
            stage.setScene(new Scene(root));
            stage.setTitle("Clinica - Principal");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        lblMessage.setText("Usuario o contraseña incorrectos");
    }
}
}