package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class pedir_elementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Collection<String> listanombre = new ArrayList<>();

        for (int i =0; i<3; i++) {
            System.out.println("introduzca los nombre");
            String nombre = sc.nextLine();

            listanombre.add(nombre);
        }

        for (String nombres : listanombre) {
            System.out.println(nombres);
        }
    }
}