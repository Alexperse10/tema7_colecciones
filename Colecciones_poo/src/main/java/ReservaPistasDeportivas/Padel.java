package ReservaPistasDeportivas;

public class Padel extends Pistas{
    private TipoParedes tipopared;

    public Padel(TipoParedes tipopared,TipoTechado tipoTechado, int identificador) {
        super(tipoTechado,identificador);
        this.tipopared =tipopared;
    }

    @Override
    public TipoTechado getTipo() {
        return super.getTipo();
    }

    @Override
    public void setIdentificador(int identificador) {
        super.setIdentificador(identificador);
    }

    @Override
    public int getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    public void setTipo(TipoTechado tipo) {
        super.setTipo(tipo);
    }

    public void setTipopared(TipoParedes tipopared) {
        this.tipopared = tipopared;
    }

    public TipoParedes getTipopared() {
        return tipopared;
    }

    @Override
    public String toString() {
        return "Padel{" +
                "tipopared=" + tipopared +
                '}';
    }
}
