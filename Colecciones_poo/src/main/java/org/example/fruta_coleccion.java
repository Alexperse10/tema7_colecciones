package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class fruta_coleccion {
    public static void main(String[] args) {
        Collection <String> listafrutas = new ArrayList<>(); // he creado la lista de frutas

        listafrutas.add("manzana");
        listafrutas.add("pera");
        listafrutas.add("plantano");

        for (String fruta : listafrutas) {
            System.out.println(fruta);
        }

        System.out.println("hay un total de: "+ listafrutas.size());

        if (listafrutas.contains("pera")){
            System.out.println("la lista contiene pera");
        }

        listafrutas.remove("pera");

        System.out.println("==== Lista actualizada ====");

        for (String frutaactual : listafrutas) {
            System.out.println(frutaactual);
        }
    }

}
