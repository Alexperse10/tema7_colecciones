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

    public abstract void votar();
    public static int encuentasatisfaccion() {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public boolean isVotado() {
        return votado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setVotado(boolean votado) {
        this.votado = votado;
    }

}
