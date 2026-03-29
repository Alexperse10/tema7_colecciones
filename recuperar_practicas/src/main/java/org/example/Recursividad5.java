package org.example;

public class Recursividad5 {

        public static void main(String[] args) {
            int numero = 5;
            System.out.println(Binario(numero));
        }

        public static String Binario(int numero) {


            if (numero < 2) {
                return String.valueOf(numero);
            }


            return Binario(numero / 2) + (numero % 2);
        }
    }
