package ReservaPistasDeportivas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
// funcion
public class ReservaApp {
    public static void main(String[] args) {
        Usuarios usuario1 = new Usuarios(1, "alex");
        Padel padel1 = new Padel(TipoParedes.cemento,TipoTechado.exterior,01);
        Padel padel2 = new Padel(TipoParedes.cristal,TipoTechado.exterior,02);
        Padel padel3 = new Padel(TipoParedes.cemento,TipoTechado.exterior,03);
        Padel padel4 = new Padel(TipoParedes.cristal,TipoTechado.exterior,04);
        Tenis tenis1 = new Tenis(TipoTechado.exterior,TipoSuperficie.batida,05);
        Tenis tenis2 = new Tenis(TipoTechado.indoor,TipoSuperficie.cemento,06);
        Tenis tenis3 = new Tenis(TipoTechado.indoor, TipoSuperficie.hierba,07);
        Usuarios usuario2 = new Usuarios(2,"juan");
        Usuarios usuarios3 = new Usuarios(3,"alfred");
        Usuarios usuarios4 = new Usuarios(4, "nacho");
        List<Reserva> listareserva = new ArrayList<>();
        LocalDateTime fecha1 = LocalDateTime.of(2026,4,15,19,20); // primero creo el objeto hora para introducirlo en la reserva
        LocalDateTime fecha2 = LocalDateTime.of(2026,8,24,18,18);
        LocalDateTime fecha3 = LocalDateTime.of(2026,2,14,17,30);

        Reserva reserva1 = new Reserva(padel1,usuario1,fecha1);
        Reserva reserva2 = new Reserva(padel2,usuario1,fecha2);
        Reserva reserva3 = new Reserva(tenis2,usuarios3,fecha3);
        listareserva.add(reserva1);
        listareserva.add(reserva2);
        listareserva.add(reserva3);

        for (int i=0; i<)

//        for (Reserva reserva_variable : listareserva){
//           System.out.println( reserva_variable.getPistas());
//           if (reserva_variable.getPistas() instanceof Padel) {
//               listareserva.remove(reserva_variable);
           }

        }



    }

}
