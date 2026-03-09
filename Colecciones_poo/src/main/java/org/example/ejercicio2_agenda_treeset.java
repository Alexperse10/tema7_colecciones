package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejercicio2_agenda_treeset {
    public static void main(String[] args) {
        Set<String> listacontactos = new TreeSet<>(); // el treeset te permite ordenar la lista por orden alfabetico
        // en la interfaz set ni en su implementacion treeset se puede utilizar el indexof
        Scanner sc = new Scanner(System.in);
        char opcion;
        System.out.println("---- AGENDA -----");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("x. Salir");

        do {
            System.out.println("introduce una opcion");
            opcion = sc.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.println("introduce el nuevo contacto");
                    String nuevo_contacto = sc.nextLine();
                    listacontactos.add(nuevo_contacto);
                    break;

                case '2':
                    System.out.println("Mostrar contactos");
                    for (String contacto : listacontactos) {
                        System.out.println(contacto);
                    }
                    break;

                case '3':
                    System.out.println("introduce el contacto que deseas buscar");
                    String contacto_busqueda = sc.nextLine();
                    if (!listacontactos.contains(contacto_busqueda)){
                        System.out.println("lo siento el contacto no se encuentra en la lista");
                    }else {
                        System.out.println("el contacto existe");
                    }
                    break;
                case '4':
                    String contacto_eliminar = sc.nextLine();
                    listacontactos.remove(contacto_eliminar);
                    System.out.println("contacto eliminado");

                    break;
                case 'x':
                    System.out.println("saliendo del programa...");
                    break;

                default:
                    System.out.println("opcion incorrecta");
            }
        }while (opcion != 'x');
    }
}
