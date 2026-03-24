package comparable_ejemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable_ej {
    public static void main(String[] args) {
        List<Estudiante> listaestadiante = new ArrayList<>();
        listaestadiante.add(new Estudiante("aarlos",22));
        listaestadiante.add(new Estudiante("bamuel",25));
        listaestadiante.add(new Estudiante("comas",28));

        Collections.sort(listaestadiante);

        System.out.println(listaestadiante);
        Collections.sort(listaestadiante, Collections.reverseOrder());
        System.out.println(listaestadiante);

        // los casos que se utilizan comparable son treeset, treemap y sort, se utiliza sort cuando quiero ordenar una coleccion tipo lista
    }
}
