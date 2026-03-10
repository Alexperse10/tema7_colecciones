package colecciones_avanzado;

import java.util.Objects;

public class Informes {
    private int codigo;
    private String descripcion;
    private String tipo; // tipo administrativo, empresarial, personal

    public Informes(int codigo, String descripcion, String tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("ADMINISTRATIVO") || tipo.equals("EMPRESARIAL") ||tipo.equals("PERSONAL")) {
            this.tipo = tipo;
        }else {
            System.out.println("Dato invalido ");
        }

    }

    @Override // sobreescribir para identificar tareas unicas por codigo y tipo
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informes informes = (Informes) o;
        return codigo == informes.codigo && Objects.equals(descripcion, informes.descripcion) && Objects.equals(tipo, informes.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, tipo);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Informes{" +
                "codigo=" + codigo +
                ", descripcion=" + descripcion +
                '}';
    }
}
