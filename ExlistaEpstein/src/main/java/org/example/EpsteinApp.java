package org.example;

import java.util.ArrayList;
import java.util.Queue;

public class EpsteinApp {

    static ArrayList<Famoso> listaEpstein = new ArrayList<>();

    public static void main(String[] args) {
        procesardatos();


    }

    public static void procesardatos() {
        System.out.println("procesando datos desde entradaDatos...");
            EntradaDatos.generarDatos(); // primero meto los datos en la cola
            Queue<Famoso> cola = EntradaDatos.getDatosActuales(); // me da la cola
        while (!cola.isEmpty()){
                System.out.println("grabando"+cola.peek());
              listaEpstein.add(cola.poll());




        }
    }

    public static void nuevoFamoso(){

    }

    public static void buscarFamaso() {

    }

   public static void eliminarMenores(){

    }

   public static void generarEstadisticas() {

    }

    public static Estadistica generarEstadistica() {
        return null;

    }


}
