package org.example;

import java.util.Scanner;

public class Recursividad3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("[1] Invertir numero");
        System.out.println("[2] invertir cadena");
        System.out.println("que deseas hacer?");
        int numero = sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("introducir numero");
                int numero_inver = sc.nextInt();
               System.out.println( invertirnumero(numero_inver,0));
               break;
            case 2:
                System.out.println("introducir texto");
                sc.nextLine();
                String texto = sc.nextLine();
                char[] array = texto.toCharArray();
                invertircadena(array, array.length - 1);
                System.out.println();
                break;
            default:
                System.out.println("opcion no valida");

        }
    }

    static public int invertirnumero (int numero, int numero_inver){

        if (numero ==0) {
            return numero_inver;

        }

        int digito = numero%10;
        return invertirnumero(numero/10,numero_inver*10 +digito);

    }

    static public void invertircadena(char[] caracteres, int indice) {
        if (indice<0) {
            return;
        }

        System.out.println(caracteres[indice]);
        invertircadena(caracteres,indice-1);
    }

}
