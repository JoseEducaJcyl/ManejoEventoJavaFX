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
        // Se crea una etiqueta "Nombre: " para el campo de nombre
        Label nombreLabel = new Label("Nombre: ");
        // Se crea una etiqueta "Email: " para el campo de email
        Label emailLabel = new Label("Email: ");
        // Se crea un campo de texto para ingresar el nombre
        TextField nombreField = new TextField();
        // Se crea un campo de texto para ingresar el email
        TextField emailField = new TextField();

        // Se crea un panel de cuadrícula (GridPane) para organizar los elementos
        GridPane grid = new GridPane();
        // Se establece el espacio horizontal entre columnas: 10 píxeles
        grid.setHgap(10);
        // Se establece el espacio vertical entre filas: 10 píxeles
        grid.setVgap(10);

        // Se añade la etiqueta de nombre en la columna 0, fila 0
        grid.add(nombreLabel, 0, 0);
        // Se añade el campo de nombre en la columna 1, fila 0
        grid.add(nombreField, 1, 0);
        // Se añade la etiqueta de email en la columna 0, fila 1
        grid.add(emailLabel, 0, 1);
        // Se añade el campo de email en la columna 1, fila 1
        grid.add(emailField, 1, 1);

        // Se crea un botón con el texto "Enviar"
        Button btnEnviar = new Button("Enviar");

        // Se asigna una acción al botón cuando es presionado
        btnEnviar.setOnAction(e -> {
            // Se obtiene el texto ingresado en el campo de nombre
            String nombre = nombreField.getText();
            // Se obtiene el texto ingresado en el campo de email
            String email = emailField.getText();

            // Se verifica si el nombre o el email están vacíos
            if (nombre.isEmpty() || email.isEmpty()) {
                // Si algún campo está vacío, se crea una alerta de tipo WARNING
                Alert alert = new Alert(Alert.AlertType.WARNING);
                // Se establece el título de la alerta
                alert.setTitle("Advertencia");
                // Se establece el contenido del mensaje
                alert.setContentText("Campos obligatos");
                // Se muestra la alerta y se espera a que el usuario la cierre
                alert.showAndWait();
            } else {
                // Si ambos campos están completos, se imprimen en la consola
                System.out.println("Nombre: " + nombre);
                System.out.println("Email: " + email);
            }
        });

        // Se añade el botón en la columna 2, fila 1 (tercera columna, segunda fila)
        grid.add(btnEnviar, 2, 1);

        // Se crea la escena con el GridPane como raíz (tamaño automático)
        Scene scene = new Scene(grid);
        // Se asigna la escena a la ventana
        stage.setScene(scene);
        // Se asigna el título de la ventana principal
        stage.setTitle("Manejo Eventos");
        // Se hace visible la ventana
        stage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}