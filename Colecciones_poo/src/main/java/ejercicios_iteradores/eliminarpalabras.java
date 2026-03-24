package ejercicios_iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class eliminarpalabras {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("ana","luis","antonio","pepe"));
        Iterator<String> it = lista.iterator();

        while (it.hasNext()){
            String nombre = it.next();
            if (nombre.startsWith("a")){
                it.remove();
            }
        }
        System.out.println(lista);
    }
}
