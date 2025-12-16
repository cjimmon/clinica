module com.mycompany.clinica {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.clinica to javafx.fxml;
    exports com.mycompany.clinica;
}
