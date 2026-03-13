package Diccionario_ingles;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

    private HashMap<String, String> diccionario;


    public Diccionario() {
        diccionario = PalabrasDicc.cargarDiccionario();


    }

    public void nuevopar(String español, String ingles) {
        diccionario.put(español,ingles);

    }

    public String traduce(String español) {
       return diccionario.get(español);

    }

    public String palabraAleatoria() {

        ArrayList<String> palabra = new ArrayList<>(diccionario.keySet());
        Random aleatorio = new Random();
        return palabra.get(aleatorio.nextInt(palabra.size()));
    }

    public char primeraLetraTraduccion(String español) {
        String traduccion = diccionario.get(español);
        return traduccion.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diccionario dicionario_ = new Diccionario();


        while (true){


        String palabra = dicionario_.palabraAleatoria();

        System.out.println("traduce la palabra: "+palabra);
        System.out.println("pista empieza por: "+dicionario_.primeraLetraTraduccion(palabra));

        String repuesta = sc.nextLine();

        if (repuesta.equals("fin")) {
            break;
        }

        String correcta = dicionario_.traduce(palabra);

        if (repuesta.equals(correcta)){
            System.out.println("correcto");
        }else {
            System.out.println("Incorrecto era: "+correcta);
        }



        }
        System.out.println("fin del programa");
    }

}


