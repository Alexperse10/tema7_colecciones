package org.example;

public class Recursividad6 {
        public static void main(String[] args) {
            System.out.println(ordenada("abc"));
            System.out.println(ordenada("aab"));
            System.out.println(ordenada("cba"));
        }

        public static boolean ordenada(String palabra) {


            if (palabra.length() <= 1) {
                return true;
            }


            if (palabra.charAt(0) > palabra.charAt(1)) {
                return false;
            }


            return ordenada(palabra.substring(1));
        }
    }

