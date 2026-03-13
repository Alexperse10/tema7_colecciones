package miniejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Paiscapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> mapaciudades = new HashMap<>();

        mapaciudades.put("españa","madrid");
        mapaciudades.put("estados unidos", "nueva york");
        mapaciudades.put("Francia","Paris");
        mapaciudades.put("Italia","Roma");
        mapaciudades.put("Alemania","Berlin");


        System.out.println("introduce un pais");
        String pais = sc.nextLine(); //pongo nexline porque

        if (mapaciudades.containsKey(pais)) {
            System.out.println("la captial es " + mapaciudades.get(pais));
        }else {
            System.out.println("el pais no se encuentra en la base de datos");
        }
    }
}
