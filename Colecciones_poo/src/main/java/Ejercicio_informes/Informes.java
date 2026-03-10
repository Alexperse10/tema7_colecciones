package Ejercicio_informes;

import java.util.Objects;

public class Informes {
    private int codigo;
    private String descripcion;
    private Tipo tipo;

    public Informes(int codigo, String descripcion, Tipo tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
        // estas dos funcionalidades sirven para que java sepa cuando dos objetos son iguales
        // dos objetos con los mismos datos no son iguales por defectop
        // equals define cuando dos objetos son iguales
        // hascode() ayuda a encontrarlos rapido en estructuras hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informes informes = (Informes) o;
        return codigo == informes.codigo && Objects.equals(descripcion, informes.descripcion) && tipo == informes.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, tipo);
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Informes{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
