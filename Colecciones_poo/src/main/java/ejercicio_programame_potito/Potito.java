package ejercicio_programame_potito;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Potito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean gustado=true;
        final int max_potitos =25; 
        Set<String> listaingrediente = new TreeSet<>();
        System.out.println("cuantos potitos se le ha dado");
        int numero_potitos = sc.nextInt();
        if (numero_potitos > max_potitos) {
            System.out.println("Error el numero de potitos no debe ser superior a 25");

        }else {
            System.out.println(numero_potitos);
            
            for (int i =0; i<numero_potitos; i++){

            }

        }

        }
    }

