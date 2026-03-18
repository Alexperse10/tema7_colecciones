package Iteradores_practicar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Correctorerrores {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("java","es","dificil","y","divertido"));

        ListIterator<String> it = lista.listIterator();

        while (it.hasNext()){
            String elemento = it.next();
            if (elemento.equals("dificil")){
                it.set("facil");
            }

        }
        System.out.println(lista);
    }
}
