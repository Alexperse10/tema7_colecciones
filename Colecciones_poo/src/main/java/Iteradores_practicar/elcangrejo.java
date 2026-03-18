package Iteradores_practicar;

import java.util.*;

public class elcangrejo {
    public static void main(String[] args) {

        //List<String> lista = Arrays.asList("pera","platano","manzana"); //con esta lista puedo meter elementos sin necesidad de hacer el add
        // con esta lista asi creariamos una lista fija, es decir si eliminamos un valor apareceria un cero en su lugar
        //para solucionarlo lo que debemos hacer es introducir el aslist

        List<String> lista = new ArrayList<>(Arrays.asList("lunes","martes","miercoles","jueves"));

        ListIterator<String> it = lista.listIterator(); // se crea el listiterator donde puedo recorrer la lista para adelante y para atras

        while (it.hasNext()){
            String elemento = it.next();
            System.out.println(elemento);

        }

        while (it.hasPrevious()){
            String elemento = it.previous();
            System.out.println(elemento);
        }



    }

}
