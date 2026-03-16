package ReservaPistasDeportivas;

public class Tenis extends Pistas{
    private TipoSuperficie superficie;

    public Tenis(TipoTechado tipoTechado, TipoSuperficie superficie,int identificador) {
        super(tipoTechado,identificador); // se llama al constructor de las pistas, en super introduzco variable sin el tipo de variable.
        this.superficie = superficie;

    }

    @Override
    public int getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    public void setIdentificador(int identificador) {
        super.setIdentificador(identificador);
    }

    @Override
    public void setTipo(TipoTechado tipo) {
        super.setTipo(tipo);
    }

    @Override
    public TipoTechado getTipo() {
        return super.getTipo();
    }

    public TipoSuperficie getSuperficie() {
        return superficie;
    }

    public void setSuperficie(TipoSuperficie superficie) {
        this.superficie = superficie;
    }
}
