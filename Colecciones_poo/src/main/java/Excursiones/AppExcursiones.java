package Excursiones;

import java.util.Scanner;

public class AppExcursiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****  APP EXCURSIONES *****");
        Excursion terra_mitica = new Excursion("Terra Mitica", "Benidorm",30.0);

        terra_mitica.insertarProfesor();

        terra_mitica.inscribirasistente();

        terra_mitica.inscribirasistente();

        terra_mitica.verAsistente();
        System.out.println("introduce edad minima");
        int edad = sc.nextInt();
        terra_mitica.eliminarasistenteporedad(edad);
        terra_mitica.verAsistente();
        terra_mitica.calcularimporte();
    }
}
