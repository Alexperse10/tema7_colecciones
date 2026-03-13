package ejercicio_programame_potito;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Potito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            Set<String> listagusta = new TreeSet<>(); // Set son conjuntos no son listas
            Set<String> listanogusta = new TreeSet<>(); // no te permite duplicados y lo ordena alfabeticamente
            System.out.println("introduce el numero de potitos");
            int numeropotitos = sc.nextInt();
            sc.nextLine();
            if (numeropotitos ==0){
                break;
            }
            for (int i =0 ; i<numeropotitos;i++) { // se ejecuta szegun el numero de potitos que le introduzca
                System.out.println("introduce la frase");
                String frase = sc.nextLine();

                String vector_frase [] = frase.split(" ");
                for (int j =1; j< vector_frase.length; j++){ //recorre las palabras
                    if (vector_frase[j].equals("FIN")){ // busca la palabra fin
                        break;
                    }
                    if (vector_frase[0].equals("SI:")){ // busca la palabra si, si es no añade a otra lista
                        listagusta.add(vector_frase[j]);
                    }else {
                        listanogusta.add(vector_frase[j]);
                    }
                }
            }
            listanogusta.removeAll(listagusta); //elimina de listanogusta todos los elementos que estén en listagusta
            for (String list_ : listanogusta){
                System.out.println(list_);
            }


        }
    }
}

