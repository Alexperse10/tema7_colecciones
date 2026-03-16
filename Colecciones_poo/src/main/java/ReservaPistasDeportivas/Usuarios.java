package ReservaPistasDeportivas;

public class Usuarios {
    private String usuarios;
    private int id;

    public Usuarios(int id, String usuarios) {
        this.id = id;
        this.usuarios = usuarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "usuarios='" + usuarios + '\'' +
                ", id=" + id +
                '}';
    }
}
