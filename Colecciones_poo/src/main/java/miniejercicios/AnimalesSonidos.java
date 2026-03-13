package miniejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class AnimalesSonidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> mapaanimales = new HashMap<>();
        mapaanimales.put("perro","ladra");
        mapaanimales.put("gato","maulla");
        mapaanimales.put("vaca","muge");
        mapaanimales.put("oveja","bala");
        System.out.println(mapaanimales.keySet()); // keyset devuelve todas las claves del mapa.
        Random aleatorio = new Random(); // se crea el random

        // para poder usar posiciones necesito crear una lista

        ArrayList<String> lista = new ArrayList<>(mapaanimales.keySet());
        // el problema del hashmap es que no tiene posiciones, pero una lista si que las tiene
        // entonces se convierte [perro, gato, vaca, oveja] en esto :

//        indice 0 -> perro
//        indice 1 -> gato
//        indice 2 -> vaca
//        indice 3 -> oveja

        // eso permite usar random

        int posicion = aleatorio.nextInt(lista.size()); //genera posicion aleatoria
        String animales = lista.get(posicion); //obtengo en una variable el animales

        String sonido = mapaanimales.get(animales);

        System.out.println("que sonido hace " +animales);
        System.out.println("escribe la respùesta");
        String respuesta = sc.nextLine();

        if (respuesta.equals(sonido)){
            System.out.print("es correcto");
        }else {
            System.out.println("es incorrecto");
        }
    }
}
