package org.example;

public class Recursividaduno {
    public static void main(String[] args) {
         System.out.println(contar(5454));
    }
    public static int contar (int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contar(numero/10);

        }
    }
}
