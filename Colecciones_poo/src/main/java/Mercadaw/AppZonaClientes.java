package Mercadaw;

import java.util.*;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner sc = new Scanner(System.in);
    static Cliente clienteactual;

    public static void main(String[] args) {
        Mercadaw mercadaw1 = new Mercadaw();
        char respuesta;
        mercadaw1.generarclientes();
        autenticacion(mercadaw1.getClientes());
        iniciarcompra();
        do {
            imprimirproductos();
            System.out.println("elige un producto");
            Producto producto = Producto.valueOf(sc.nextLine());

            clienteactual.insertarProducto(producto);
            System.out.println("quieres meter mas productos");
            respuesta = sc.nextLine().toLowerCase().charAt(0);
        } while (respuesta == 's');
        imprimirresumen();
        mostraropcion();

    }

    public static void autenticacion(Set<Cliente> cliente) {
        boolean repetir = false;
        int contador = 0;
        do {

            System.out.println("==== Compra online en mercadaw ====");
            System.out.println("usuario: ");
            String usuario = sc.nextLine();
            System.out.println("contraseña: ");
            String contraseña = sc.nextLine();

            for (Cliente cliente_ : cliente) {
                if (cliente_.getUsuario().equals(usuario) && cliente_.getContraseña().equals(contraseña)) {
                    System.out.println("bienvenido " + usuario);
                    repetir = true;
                    clienteactual = cliente_; //creo una variable estatica de tipo cliente para guardar el cliente validado

                    break;
                }

            }
            if (!repetir) {
                contador++;
                System.out.println("Datos invalidos :" + contador);

            }
            if (contador == 3) {
                System.out.println("error de autenticacion");
            }

        } while (contador < 3 && !repetir);
    }


    public static void iniciarcompra() {
        clienteactual.crearpedido();


    }

    public static void imprimirproductos() {
        for (Producto producto_ : Producto.values()) {
            System.out.println(producto_ + " " + producto_.getPrecio()); // quito el tostring para que me salga mas bonito de la clase enum producto
        }
    }

    public static void imprimirresumen() {
        System.out.println("== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("productos:");
        for (Map.Entry<Producto, Integer> entry : clienteactual.getPedido().getMapapedido().entrySet()) {
            System.out.println(entry);
        }
        System.out.println("el importe total: " + clienteactual.getPedido().getImportetotal());
    }

    public static void imprimirdespedida() {
        System.out.println("=== GRACIAS POR SU PEDIDO ====");
        System.out.println("lo recibira en uno dias en la direccion calle falsa, 123");
    }

    public static void mostraropcion() {
        int numero;
        do {
            System.out.println("==================");
            System.out.println("Que desea hacer");
            System.out.println("[1] aplicar promos");
            System.out.println("[2] Mostrar resumen ordenador por uds");
            System.out.println("[3] Terminar pedido");

            numero = sc.nextInt();
            switch (numero) {
                case 1:
                    clienteactual.getPedido().aplicarPromo3x2();
                    clienteactual.getPedido().aplicarPromo10();
                    imprimirresumen();
                    clienteactual.setPromociones(true);
                    break;
                case 2:
                    imprimirresumen();
                    break;
                case 3:
                    imprimirdespedida();
                    break;
                default:
                    System.out.println("introduce una opcion valida");

            }


        } while (numero != 3);
    }
}






