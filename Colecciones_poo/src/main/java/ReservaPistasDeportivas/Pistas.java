package ReservaPistasDeportivas;

public abstract class Pistas {
    private static final String indoor = "indoor";
    private static final String exterior = "exterior";
    private String tipo;
    private int identificador;

    public Pistas(String tip) {
        this.tipo = tipo;
    }
}
