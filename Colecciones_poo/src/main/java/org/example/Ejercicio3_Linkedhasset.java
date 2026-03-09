package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3_Linkedhasset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listanavegacion = new LinkedHashSet<>(); // con esta implementacion se puede 
        String url;
        do {
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
             url = sc.nextLine().toLowerCase();
             listanavegacion.add(url);
        }while (!url.contains("salir"));// introduzco el contains con salir porque es un string

        System.out.println("historial de navegacion");

        int contador =0; //no hace falta introducir un for tradicional con un contador es suficiente
        for (String nav_ : listanavegacion){
            System.out.println(+contador+ " "+nav_);
            contador++;
        }
        }
    }

