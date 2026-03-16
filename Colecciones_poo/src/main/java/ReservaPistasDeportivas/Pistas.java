package ReservaPistasDeportivas;

public abstract class Pistas{ // recordar que de la clase abstract no se pueden crear objetos
    // la creo como padre para otras clases
//    private static final String indoor = "indoor";
//    private static final String exterior = "exterior";
    private TipoTechado tipo;
    private int identificador;

    public Pistas(TipoTechado tipo, int identificador) {
        this.tipo = tipo;
        this.identificador= identificador;
    }


    public void setTipo(TipoTechado tipo) {
        this.tipo = tipo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public TipoTechado getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pistas{" +
                "tipo=" + tipo +
                ", identificador=" + identificador +
                '}';
    }
}
