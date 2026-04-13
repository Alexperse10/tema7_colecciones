package org.example;

public class Nacional extends Votante{
    private String dni;
    public Nacional(String nombre, String poblacion, String dni) {
        super(nombre, poblacion);
        this.dni = dni;
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
    public String votar() {
        return "";
    }

    @Override
    public String toString() {
        return "Nacional{" +
                "dni='" + dni + '\'' +
                '}';
    }
}
