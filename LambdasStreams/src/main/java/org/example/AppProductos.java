package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("tv", 500,"electronica"));
        productos.add(new Producto("raton",20,"electronica"));
        productos.add(new Producto("sofa",300,"hogar"));
        productos.add(new Producto("portatil",900,"electronica"));

        FiltrarProducto filtro = producto -> producto.getCategoria().equals("electronica") && producto.getPrecio()>100;

        List<Producto> filtrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (filtro.filtrar(producto)) {
                filtrados.add(producto);
            }
        }
        for (Producto producto : filtrados) {
            System.out.println(producto.getNombre()+ "-" +producto.getPrecio());
        }
    }
}
