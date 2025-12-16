package com.mycompany.clinica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class MainViewController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    private void showFacturas() {
        loadContent("FacturasView.fxml");
    }

    @FXML
    private void showPacientes() {
        loadContent("PacientesView.fxml");
    }

    @FXML
    private void showCitas() {
        loadContent("CitasView.fxml");
    }

    private void loadContent(String fxml) {
        try {
            Parent pane = FXMLLoader.load(getClass().getResource("/com/mycompany/clinica/" + fxml));
            contentPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
