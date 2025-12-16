package com.mycompany.clinica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/clinica/LoginView.fxml"));
        Parent root = loader.load();

           Scene scene = new Scene(root, 400, 250);
scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
stage.setScene(scene);
stage.setTitle("Login - Reserva Rural App");
stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}