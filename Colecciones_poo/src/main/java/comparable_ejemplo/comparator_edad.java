package comparable_ejemplo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class comparator_edad {
    public static void main(String[] args) {
        List<Estudiante> listaestudiante = new ArrayList<>();

        listaestudiante.add(new Estudiante("alex",20));
        listaestudiante.add(new Estudiante("fran",15));
        listaestudiante.add(new Estudiante("greg",30));

        listaestudiante.sort(Comparator.comparing(e -> e.getEdad()));

        System.out.println(listaestudiante);
        listaestudiante.sort(Comparator.comparing(Estudiante::getEdad).reversed());
        // utilizo sort cuando deseo ordenar una coleccion tipo lista
        System.out.println(listaestudiante);
    }
}
