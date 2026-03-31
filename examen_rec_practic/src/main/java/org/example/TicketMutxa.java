package org.example;

import java.time.LocalDate;
import java.util.*;

public class TicketMutxa {
    static Scanner sc = new Scanner(System.in);
    static Random aleatorio = new Random();
    static Set<Usuario> usuariosRegistrados = new HashSet<>();
    static Set<Evento> listaEventos = new HashSet<>();

    public static void insertarEvento(String nombre, LocalDate fecha, double precio, String tipo){

        switch (tipo) {
            case "festival":
                String artista_festi;
                do {
                    System.out.println("introduce los artistas en el festival, o salir para terminar");
                    artista_festi = sc.nextLine();
                    listaEventos.add(new Festival(nombre, fecha, precio));

                } while (!artista_festi.equalsIgnoreCase("salir"));
                System.out.println("creando festival");
                break;

            case "concierto":
                String artista;
                do {
                    System.out.println("insertar los artistas que actuaran en el concierto, o salir para terminar");
                    artista = sc.nextLine();
                    listaEventos.add(new Concierto(nombre, fecha, precio, artista));
                } while (!artista.equalsIgnoreCase("salir"));
                System.out.println("creando concierto");
                break;

            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static void generarUsuarios(int cantidad) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < cantidad; i++){
            String usuario = "";
            for (int j = 0; j < 8; j++){
                int indice = aleatorio.nextInt(caracteres.length());
                usuario += caracteres.charAt(indice);
            }

            String contraseña = "";
            for (int j = 0; j < 8; j++){
                int indice = aleatorio.nextInt(caracteres.length());
                contraseña += caracteres.charAt(indice);
            }

            System.out.println("el usuario es " + usuario);
            System.out.println("la contraseña es: " + contraseña);

            usuariosRegistrados.add(new Usuario(usuario, contraseña));
        }
    }

    public static void verEventos() {

        int contador = 0;
        for (Evento evento : listaEventos){
            contador++;
            System.out.println("[" +contador + "] " + evento.getNombre() + " " + evento.getFecha());
        }

        System.out.println("hola elige un evento para inciar compra");
        int posicion = sc.nextInt();

        Evento seleccionado = getEvento(posicion);
        if (seleccionado == null){
            System.out.println("opcion no valida");
        }else {
            System.out.println("Estas comprando entradas para :"+seleccionado.getNombre()+ " "+seleccionado.getFecha());
        }

        Queue<Usuario> virtual = new LinkedList<>();
        int contador_ =0;
        for (Usuario virtual_ : usuariosRegistrados){
            virtual.offer(virtual_);
            contador_++;
            System.out.println("estas en la posicion "+contador_+" de la cola virtual");
        }

        }





    public static Evento getEvento(int posicion) {
        return null;
    }

    public static Set<Evento> getListaEventos() {
        return listaEventos;
    }

    public static Set<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
}