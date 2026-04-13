package org.example;

public class Extranjero extends Votante{
    private String pais;
    private String nie;
    public Extranjero(String nombre, String poblacion, String pais, String nie) {
        super(nombre, poblacion);
        this.pais = pais;
        this.nie = nie;
    }

    @Override
    public String getPoblacion() {
        return super.getPoblacion();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNie() {
        return nie;
    }

    public void setNie(String nie) {
        this.nie = nie;
    }

    @Override
    public boolean isVotado() {
        return super.isVotado();
    }

    @Override
    public String votar() {
        return "";
    }
}
