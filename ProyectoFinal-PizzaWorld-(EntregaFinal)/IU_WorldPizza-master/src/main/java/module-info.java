module com.app.interfazusuario_wp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.interfazusuario_wp to javafx.fxml;
    exports com.app.interfazusuario_wp;
}