package ReservaPistasDeportivas;

import java.time.LocalDateTime;
import java.util.Date;

public class Reserva {
    private Usuarios usuario;
    private Pistas pistas;
    private LocalDateTime fecha_hora;

    public Reserva(Pistas pistas, Usuarios usuario, LocalDateTime fecha_hora) {
        this.usuario = usuario;
        this.pistas = pistas;
        this.fecha_hora = fecha_hora;
    }


    public Pistas getPistas() {
        return pistas;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setPistas(Pistas pistas) {
        this.pistas = pistas;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", pistas=" + pistas +
                ", fecha_hora=" + fecha_hora +
                '}';
    }
}
