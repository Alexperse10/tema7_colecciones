package org.example;

public class Recursividaddos {
    public static void main(String[] args) {
           System.out.println( calcular(2,3));
    }
    public static int calcular (int base, int exponente) {
        if (exponente == 0){
            return 1;
        }else {

            return base * calcular(base,exponente-1);
        }
    }
}
