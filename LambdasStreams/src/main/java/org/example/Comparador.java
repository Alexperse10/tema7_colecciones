package org.example;

public class Comparador {
    public static void main(String[] args) {
        Ejecutor lambda = (num) -> {
            return num > 10;
        };

        System.out.println(lambda.ejecutar(15));
        System.out.println(lambda.ejecutar(5));
    }
}
