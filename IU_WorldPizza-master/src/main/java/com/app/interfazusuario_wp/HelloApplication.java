package com.app.interfazusuario_wp;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
/**
 * HelloAplication es la clase principal donde se ejecuta todo el funcionamiento del programa.
 */
public class HelloApplication extends Application {
    private double xOffset;
    private double yOffset;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("world_pizza.fxml"));
        Parent root = loader.load();

        //Métodos
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getSceneX() - xOffset);
                stage.setY(event.getSceneY() - yOffset);
            }
        });

        Scene scene = new Scene(root);
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("world_pizza.fxml"));
        //Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("WorldPizza");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}