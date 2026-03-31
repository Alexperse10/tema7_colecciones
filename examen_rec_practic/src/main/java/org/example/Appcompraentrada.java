package org.example;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

public class Appcompraentrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       TicketMutxa.insertarEvento("paellas", LocalDate.of(2025,4,16),20,"festival");
        TicketMutxa.insertarEvento("Concierto estopa", LocalDate.of(2025,4,21),40,"concierto");

        //crear usuarios
        TicketMutxa.generarUsuarios(4);
        Set<Usuario> lista = TicketMutxa.getUsuariosRegistrados(); // realizar una lista con los usuarios registrados
        Usuario aux = new Usuario("temp","temp");
        boolean autenticado;
        do {
            autenticado = aux.autenticarse(lista);

            if (!autenticado) {
                System.out.println("Inténtalo de nuevo");
            }

        } while (!autenticado);

        Usuario comprador = null;

        System.out.println("introduce usuario otra vez");
        String nombre = sc.nextLine();

        System.out.println("introduce contraseña");
        String contraseña = sc.nextLine();

        for (Usuario usuario : lista) {
            if (usuario.getNombre_usuario().equals(nombre) && usuario.getContraseña().equals(contraseña)){
                comprador = usuario;
                break;
            }
        }

        TicketMutxa.verEventos();
    }
}
