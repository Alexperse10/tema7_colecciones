package Mercadaw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadaw mercadaw1 = new Mercadaw();
         Cliente cliente1 = new Cliente("8447544d","845fedfe");
        Pedido pedido1 = new Pedido();

    }

    public static void autenticacion(Set<Cliente> cliente){
        System.out.println("==== Compra online en mercadaw ====");
        System.out.println("usuario: ");
        String usuario = sc.nextLine();
        System.out.println("contraseña: ");
        String contraseña = sc.nextLine();

        for (Cliente cliente_ : cliente){
            if (!cliente_.getContraseña().equals(contraseña)|| !cliente_.getUsuario(usuario)){

            }
        }

    }

    public static void iniciarcompra(){

    }

    public static void imprimirproductos() {

    }

    public static void imprimirdespedida() {

    }
    public static void mostraropcion() {

    }


    }

