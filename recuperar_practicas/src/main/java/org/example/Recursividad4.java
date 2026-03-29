package org.example;

public class Recursividad4 {

        public static void main(String[] args) {
            System.out.println(sibinario(1011));
            System.out.println(sibinario(123));
        }

        public static boolean sibinario(int numero) {


            if (numero == 0) {
                return true;
            }

            int digito = numero % 10;


            if (digito != 0 && digito != 1) {
                return false;
            }


            return sibinario(numero / 10);
        }
    }

