package ejercicios_iteradores;

import java.util.*;

public class listiterator_cambiarnumeros {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ListIterator<Integer> it = lista.listIterator();

        while (it.hasNext()){
            int numero = it.next();
            if (numero%2==0){
                it.set(0);
            }
        }
        System.out.println(lista);

    }

}
