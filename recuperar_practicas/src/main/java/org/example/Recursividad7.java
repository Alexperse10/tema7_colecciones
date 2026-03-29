package org.example;

public class Recursividad7 {
        public static void main(String[] args) {
            int n = 4;

            int resultado = suma(n);
            imprimirCadena(n);
            System.out.println(" = " + resultado);
        }


        public static int suma(int n) {
            if (n == 1) {
                return 1;
            }
            return n + suma(n - 1);
        }


        public static void imprimirCadena(int n) {
            if (n == 1) {
                System.out.print("1");
            } else {
                imprimirCadena(n - 1);
                System.out.print("+" + n);
            }
        }
    }

