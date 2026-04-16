package org.example.demojava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private Contador contador = new Contador();

    @FXML
    private Label contadorLabel;

    @FXML
    private Label welcomeText;

    @FXML
    private Button pruebaclickbutton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("hola, bienvenido a mi programa");
    }

    @FXML
    public void initialize() {

        pruebaclickbutton.setOnAction(e -> {
            contador.contar();
            contadorLabel.setText(String.valueOf(contador.getContador()));
        });

    }
}