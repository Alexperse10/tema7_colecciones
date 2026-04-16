package org.example.demojava;

public class Contador {

    private int contador;

    public Contador() {
        contador = 0;
    }

    public void contar() {
        contador++;
    }

    public int getContador() {
        return contador;
    }
}