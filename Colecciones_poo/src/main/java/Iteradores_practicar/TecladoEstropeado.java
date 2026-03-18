package Iteradores_practicar;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// va recorriendo la palabra y cogiendo los coracteres entonces va moviendo el cursor, claro cuando mueve el cursor añade la letra ya que en el else esta el add

public class TecladoEstropeado {
    public static void main(String[] args) {
        //debo utilizar el listiterator para ir para delante y para atras
        //primero debo crear la lista y despues debo crear el iterador
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> lista = new LinkedList<>();

        ListIterator<Character> it = lista.listIterator();

        System.out.println("introduce una palabra");
        String palabra = sc.next();

        for (int i=0; i<palabra.length(); i++){
            char caracter = palabra.charAt(i);
            if (caracter == '<') {
                if (it.hasPrevious()){
                    it.previous();
                }
            } else if (caracter == '>') {
                if (it.hasNext()) {
                    it.next();
                }
                } else if (caracter == '#') {
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    }else {
                        it.add(caracter);
                    }
                }
        for (char c : lista){
            System.out.println(c);
        }
            }

        }




