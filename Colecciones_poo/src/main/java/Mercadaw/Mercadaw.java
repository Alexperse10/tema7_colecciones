package Mercadaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mercadaw {
    private Set<Cliente> cliente;

    public Mercadaw() {
        this.cliente = new HashSet<>();
    }

    Random aleatorio = new Random();
    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public void generarclientes(){
        String contraseña ="";
        for (int i=0; i<8; i++){
            int indice = aleatorio.nextInt(caracteres.length());
            contraseña += caracteres.charAt(indice);
        }
        String usuario ="";
        for (int i=0; i<8; i++){
            int indice = aleatorio.nextInt(caracteres.length());
            usuario += caracteres.charAt(indice);
        }


//        Cliente cliente1 = new Cliente(usuario,contraseña);
//        cliente.add(cliente1);
//        Cliente cliente2 = new Cliente(usuario,contraseña);
//        cliente.add(cliente2);
//        Cliente cliente3 = new Cliente(usuario,contraseña);
//        cliente.add(cliente3);
//        Cliente cliente4 = new Cliente(usuario,contraseña);
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(cliente);
    }

    @Override
    public String toString() {
        return "Mercadaw{" +
                "cliente=" + cliente +
                '}';
    }
}
