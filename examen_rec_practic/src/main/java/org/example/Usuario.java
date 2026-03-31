package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static org.example.TicketMutxa.sc;

public class Usuario implements Acciones {
    Scanner sc = new Scanner(System.in);
    private String nombre_usuario;
    private String contraseña;
    private Map<Evento,Integer> carritocompra;

    public Usuario( String nombre_usuario, String contraseña){
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.carritocompra = new HashMap<>();
    }

    public void añadircarrito(Evento evento, int cantidad){

    }

    public void vercarrito(){

    }

    public void setcarrito(Evento evento, int cantidad){

    }


    @Override
    public void pagar() {

    }

    @Override
     public boolean autenticarse(Set<Usuario> usuariosRegistrados) {

        System.out.println("introducir Usuario");
        String usuario = sc.nextLine();
        System.out.println("introducir contraseña");
        String contraseña = sc.nextLine();
        for (Usuario usuario1 : usuariosRegistrados) {
            if (usuario1.getContraseña().equals(contraseña) && usuario1.getNombre_usuario().equals(usuario)) {
                System.out.println("bienvenido!");
                return true;


            }
        }
        System.out.println("credenciales no validos");
        return false;
    }


    public void setCarritocompra(Map<Evento, Integer> carritocompra) {
        this.carritocompra = carritocompra;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Map<Evento, Integer> getCarritocompra() {
        return carritocompra;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre_usuario='" + nombre_usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", carritocompra=" + carritocompra +
                '}';
    }
}
