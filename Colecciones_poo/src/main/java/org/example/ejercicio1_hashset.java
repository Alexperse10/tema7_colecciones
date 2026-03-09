package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejercicio1_hashset {
    public static void main(String[] args) {
        //treeset ordenado alfabeticamente
        // hashset orden impredecible elimina duplicados
        // linkedhashset orden de insercion
        Set<String> listafrase = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa una frase");
        String frase = sc.nextLine().toLowerCase();
        // se utiliza split que es divir en ingles
        String palabras [] = frase.split(" "); // recordar meter en el parentesis la doble comilla para los espacios
        // mucho cuidado cuando haga el split poner el espacio entre las comillas, sin espacio entre comillas coge la letra
       for (String palabras_ : palabras){
           listafrase.add(palabras_); // realiza un for para introducir las palabras en la lista
        }
       System.out.println("la frase es: "+listafrase);
        }


    }

