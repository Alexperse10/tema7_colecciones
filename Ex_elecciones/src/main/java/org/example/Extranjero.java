package org.example;

import java.util.Objects;

public class Extranjero extends Votante{
    private String pais;
    private String nie;
    public Extranjero(String poblacion, String nombre, String nie, String pais) {
        super(nombre, poblacion);
        this.pais = pais;
        this.nie = nie;
    }

    public Extranjero(String nie, String pais){
        super(null, null);
        this.nie = nie;
        this.pais = pais;

    }

    @Override
    public String getPoblacion() {
        return super.getPoblacion();
    }

    @Override
    public void votar() {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extranjero that = (Extranjero) o;
        return  Objects.equals(nie, that.nie);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nie);
    }

    @Override
    public String toString() {
        return "Extranjero{" +
                "pais='" + pais + '\'' +
                ", nie='" + nie + '\'' +
                '}';
    }
}
