package ejercicios_iteradores;

import comparable_ejemplo.Estudiante;

import java.util.*;

public class listiterator_añadirx {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));

        ListIterator<String> it = lista.listIterator();

        while (it.hasNext()) {
            it.next();
            it.add("X");
        }

        System.out.println(lista);
    }

}