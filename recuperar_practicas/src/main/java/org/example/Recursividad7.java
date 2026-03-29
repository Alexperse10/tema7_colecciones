package org.example;

public class Recursividad7 {
        public static void main(String[] args) {
            int numero = 4;

            int resultado = suma(numero);
            imprimirCadena(numero);
            System.out.println(" = " + resultado);
        }


        public static int suma(int numero) {
            if (numero == 1) {
                return 1;
            }
            return numero + suma(numero - 1);
        }


        public static void imprimirCadena(int numero) {
            if (numero == 1) {
                System.out.print("1");
            } else {
                imprimirCadena(numero - 1);
                System.out.print("+" + numero);
            }
        }
    }

