package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejercicio1_treeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listapalabras = new TreeSet<>();
        System.out.println("introduce una frase");
        String frase = sc.nextLine();

        String palabra [] = frase.split(" "); // poner comillas y espacio para separar palabras

        for (String palabras_ : palabra){
            listapalabras.add(palabras_);
        }

        System.out.println(listapalabras);
    }
}
