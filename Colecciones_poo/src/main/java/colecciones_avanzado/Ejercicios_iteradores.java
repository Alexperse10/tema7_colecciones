package colecciones_avanzado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ejercicios_iteradores {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> it = lista.listIterator();

        while(it.hasNext()){
            int num = it.next();
            if (num%2==0){
                it.remove();
            }

        }
        System.out.println(lista);
    }
}
