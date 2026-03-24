package ejercicios_iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class contar_mayores10 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(5,12,3,20,15));
        Iterator<Integer> it = lista.iterator();
        int contador =0;

        while (it.hasNext()){
            int numero = it.next();
            if (numero>10){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
