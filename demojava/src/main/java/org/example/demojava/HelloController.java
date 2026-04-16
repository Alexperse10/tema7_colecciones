package org.example.demojava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private Contador contador = new Contador();

    @FXML
    private Label welcomeText;

    @FXML
    private Label contadorLabel;

    @FXML
    private Button pruebaclickbutton;

    @FXML
    public void initialize() {
        System.out.println("INITIALIZE OK"); // para comprobar

        pruebaclickbutton.setOnAction(e -> {
            System.out.println("Botón pulsado");

            contador.contar();
            contadorLabel.setText(String.valueOf(contador.getContador()));
        });
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}