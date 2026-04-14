package org.example;

import java.util.Objects;

public class Nacional extends Votante{
    private String dni;
    public Nacional(String nombre, String poblacion, String dni) {
        super(nombre, poblacion);
        this.dni = dni;
    }

    public Nacional(String dni){
        super(null,null);
        this.dni = dni;

    }

    @Override
    public void votar() {

    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getPoblacion() {
        return super.getPoblacion();
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean isVotado() {
        return super.isVotado();
    }

    public void setDni(String dni) {
        this.dni = dni;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nacional nacional = (Nacional) o;
        return Objects.equals(dni, nacional.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Nacional{" +
                "dni='" + dni + '\'' +
                '}';
    }
}
