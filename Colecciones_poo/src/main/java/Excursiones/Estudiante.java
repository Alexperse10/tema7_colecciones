package Excursiones;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante>{
    private String apellidos;
    private String nombre;
    private String curso;
    private int edad;

    public Estudiante(String nombre, String apellidos, String curso, int edad ) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.edad = edad;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(apellidos, that.apellidos) && Objects.equals(nombre, that.nombre) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, nombre, curso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }




    @Override
    public int compareTo(Estudiante o) {
        int cmpCurso = this.curso.compareTo(o.curso);
        if (cmpCurso != 0) return cmpCurso;

        int cmpApellidos = this.apellidos.compareTo(o.apellidos);
        if (cmpApellidos != 0) return cmpApellidos;

        return this.nombre.compareTo(o.nombre); // si curso y alumnos son iguales decide por nombre
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", edad=" + edad +
                '}';
    }

//    @Override
//    public int compareTo(Estudiante o) {
//        return this.curso.compareTo(o.curso);
//    }
    // si me dijese que compare solo por curso
}
