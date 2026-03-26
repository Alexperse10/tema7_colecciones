package Mercadaw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static Mercadaw.AppZonaClientes.cliente;

public class Pedido {
    private HashMap<Producto,Integer> mapapedido;
    private double importetotal;
    Scanner sc = new Scanner(System.in);

    public Pedido() {
        this.mapapedido = new HashMap<>();
        this.importetotal = 0;
    }

    public void actualizarImportetotal(double importe){
        importetotal +=importe;

    }
    public void insertarProducto(Producto producto) { // revisarlo


            if (mapapedido.containsKey(producto)) {
                int cantidad = mapapedido.get(producto);
                mapapedido.put(producto, cantidad + 1);
            } else {
                mapapedido.put(producto, 1);
            }
            actualizarImportetotal(producto.getPrecio());



        }


    public void aplicarPromo3x2(){
        double nuevototal =0;
        for (Map.Entry<Producto, Integer> mapa : mapapedido.entrySet()){
            int cantidad = mapa.getValue();
            Producto producto = mapa.getKey();

            int grupos = cantidad/3;
            int cantidadpagar = cantidad -grupos;


            nuevototal += cantidadpagar* producto.getPrecio();
        }

        importetotal = nuevototal;

    }

    public void aplicarPromo10(){
        importetotal = importetotal*0.9;


    }

    public HashMap<Producto, Integer> getMapapedido() {
        return mapapedido;
    }

    public double getImportetotal() {
        return importetotal;
    }

    public void setMapapedido(HashMap<Producto, Integer> mapapedido) {
        this.mapapedido = mapapedido;
    }

    public void setImportetotal(double importetotal) {
        this.importetotal = importetotal;
    }



}
