package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroNombre {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("ana", "luis", "pedro", "antonio");

        nombres.stream().filter(nombre_->nombre_.length()>4)
                    .forEach(System.out::println);


        List<String> minusculas = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(minusculas);

        long cantidad = nombres.stream()
                .filter(nombress->nombress.startsWith("a"))
                .count();

        System.out.println("la cantidad de palabras que empiezan por a es: "+cantidad);
    }
}
