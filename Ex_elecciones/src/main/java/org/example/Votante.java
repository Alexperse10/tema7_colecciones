package org.example;

public abstract class  Votante {
    private String poblacion;
    private String nombre;
    private boolean votado;

    public Votante(String nombre, String poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.votado = false;

    }

    public abstract String votar();
    public static int encuentasatisfaccion() {
        return 0;
    }

    
}
