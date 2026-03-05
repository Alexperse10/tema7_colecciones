package org.example;

import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1_pilasstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pilacaracteres = new Stack<>();

        for (int i =0; i<5; i++) {
            System.out.println("Introduzca el caracter "+(i+1));
            Character carcter = sc.next().charAt(0);// el problema de poner solo un next() es que lo convierte a String pero depues lo tienes que convertir a char

            pilacaracteres.push(carcter);
        }

            System.out.println("la lista tiene "+pilacaracteres.size());
            System.out.println("el ultimo elemento es: "+pilacaracteres.peek());

            do {
                Character letras = pilacaracteres.pop();
                System.out.println("la letra es: "+letras); // se crea una variable letras que va guardando todos las letras que se eliminan
                }while (!pilacaracteres.isEmpty());
            }
        }



