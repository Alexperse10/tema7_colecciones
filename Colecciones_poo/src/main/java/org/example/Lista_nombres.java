package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Lista_nombres {
    public static void main(String[] args) {
        Collection<String> listanombre = new ArrayList<>(); // creo una coleccion de nombres de tipo string
        // colection es una interfaz;
        listanombre.add("Alex");
        listanombre.add("pedro");
        listanombre.add("alex");

        for (String nombre : listanombre) {
            System.out.println(nombre);
        }

        System.out.println("el total de elementos es: "+listanombre.size());

    }
}
