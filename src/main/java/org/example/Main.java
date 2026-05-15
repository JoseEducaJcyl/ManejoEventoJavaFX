package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label nombreLabel = new Label("Nombre: ");
        Label emailLabel = new Label("Email: ");
        TextField nombreField = new TextField();
        TextField emailField = new TextField();
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(nombreLabel, 0, 0);
        grid.add(nombreField, 1, 0);
        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);

        Button btnEnviar = new Button("Enviar");
        btnEnviar.setOnAction(e -> {
           String nombre = nombreField.getText();
           String email = emailField.getText();
           if (nombre.isEmpty() || email.isEmpty()) {
               Alert alert = new Alert(Alert.AlertType.WARNING);
               alert.setTitle("Advertencia");
               alert.setContentText("Campos obrigatos");
               alert.showAndWait();
           }else  {
               System.out.println("Nombre: " + nombre);
               System.out.println("Email: " + email);
           }
        });

        grid.add(btnEnviar, 2, 1);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Manejo Eventos");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
