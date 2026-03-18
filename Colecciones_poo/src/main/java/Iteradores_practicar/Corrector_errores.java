package Iteradores_practicar;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Corrector_errores {
    public static void main(String[] args) {
        Set<Integer> listanumeros = new TreeSet<>();
        listanumeros.add(1);
        listanumeros.add(2);
        listanumeros.add(3);
        listanumeros.add(4);
        listanumeros.add(5);

        Iterator<Integer> it = listanumeros.iterator();

        while (it.hasNext()){
            int elemeto = it.next();
            if (elemeto>3){
                it.remove();

            }



        }
        System.out.println(listanumeros); // si el print lo meto dentro del if aparecen los elementos eliminados

    }
}
