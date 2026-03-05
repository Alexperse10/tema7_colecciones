package org.example;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio2_pilasstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> listanumeros = new Stack<>();
        //int numero;
        for (int i =0; i<3; i++){
            System.out.println("introduce un numero ");
             int numero = sc.nextInt();
             listanumeros.push(numero);



        }
        System.out.println(" ==== lista normal ====");
        for (Integer numerop : listanumeros){
            System.out.println(numerop);
        }
        System.out.println("=== lista invertiva ====");
        do {
            int numero_el = listanumeros.pop();
            System.out.println(numero_el);

        }while (!listanumeros.isEmpty());



    }
}