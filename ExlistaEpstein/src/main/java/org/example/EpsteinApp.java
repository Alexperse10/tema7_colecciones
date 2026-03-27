package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class EpsteinApp {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Famoso> listaEpstein = new ArrayList<>();

    public static void main(String[] args) {
        procesardatos();
        eliminarMenores();


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
        System.out.println("**** APP MANTENIMIENTO LISTA EPSTEIN ***");
        System.out.println("Insertando famoso...");
        System.out.println("nombre");
        String nombre = sc.nextLine();
        System.out.println("pais");
        String pais = sc.nextLine();
        System.out.println("profesion");
        String profesion = sc.nextLine();
        System.out.println("edad");
        int edad = sc.nextInt();

        listaEpstein.add(new Famoso(nombre,pais,profesion,edad));
        System.out.println("famoso insetado");

        sc.nextLine();
    }

    public static void buscarFamaso() {
        System.out.println("**** APP MANTENIMIENTO LISTA EPSTEIN ***");
        System.out.println("Buscando famoso...");
        System.out.println("nombre");
        String nombre = sc.nextLine();
        System.out.println("pais");
        String pais = sc.nextLine();
        System.out.println("profesion");
        String profesion = sc.nextLine();
        System.out.println("edad");
        int edad = sc.nextInt();


        if (listaEpstein.contains(new Famoso(nombre,pais,profesion,edad))){
            System.out.print("el famoso ha acudido a la fiesta");
        }else {
            System.out.println(" el famoso no ha acudido ");
        }
    }

   public static void eliminarMenores(){
        System.out.println("eliminando menores de edad");
       Iterator<Famoso> it = listaEpstein.iterator();
       while (it.hasNext()){
           Famoso it_ = it.next();
           if (it_.getEdad()< 18){
               it.remove();
               System.out.println(it_.getNombre()+ " fulminado");
           }
       }
    }

    public static Estadistica generarEstadistica() {
        return null;

    }


}
