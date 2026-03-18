package Iteradores_practicar;

import java.util.ArrayList;
import java.util.Iterator;

//Ejercicio 1: El recorrido básico
//Crea una lista (ArrayList) con los nombres de 4 frutas.
//        Objetivo: Usa un Iterator y un bucle while para imprimir cada fruta por pantalla
//.
//Pista: Recuerda usar los métodos .hasNext() para comprobar si hay elementos y .next() para obtener el siguiente
public class Recorridobasico {
    public static void main(String[] args) {
        //el arraylist se puede meter elementos repetidos en la lista
        // aparecen segun el orden de insercion.
        ArrayList<String> listafrustas = new ArrayList<>();

        listafrustas.add("pera");
        listafrustas.add("aguacate");
        listafrustas.add("col");

        Iterator<String> it = listafrustas.iterator();
        // se crea el iterador para recorrer la lista, es como un puntero que va pasando elemento a elemento

        while (it.hasNext()){ // el hashnext devuelve un true, hace la pregunta de si quedan elementos por recorrer
            String elemento = it.next(); // devuelve el siguiente elemento y avanza con el iterador
            System.out.println(elemento);
            //dame el siguiente elemento
            //lo guardas en la lista
            // lo usas para imprimir

        }

    }
}
