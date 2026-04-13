package org.example;

import java.util.*;

public class EleccionesApp {
    static double matriz [][] = new double[2][4];
    static LinkedHashSet<Votante> yahanvotado= new LinkedHashSet<>();
    static Map<String,Integer> votosporpueblos = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** ELECCIONES APP ***");
        System.out.println("Introduce la poblacion: ");
        String poblacion = sc.nextLine();
        System.out.println("Empieza la votacion en " + poblacion);
        Censo.generarCenso();
        while (true) {
            System.out.println("Introduce el tipo de documento a validar [dni,nie] o salir para finalizar la votacion: ");
            String tipodocumento = sc.nextLine().toUpperCase();
            if (tipodocumento.equalsIgnoreCase("salir")) break;

            System.out.println("Introduce el número del DNI/NIE que has presentado: ");
            String documento = sc.nextLine();

            if (validarDocumento(documento)) {
                
            }

        }
    }

    public static boolean validarDocumento (String documento) {

        System.out.println("introduce el dni/nie");
        String dni = sc.nextLine();
        if (!dni.matches("\\d{8}[A-Za-z]")){
            System.out.println("el dni/nie no es correcto");
            return false;
        }
        return true;
    }


    public static boolean verificarEmpadronamiento(Votante votante) {
        return true;
    }

    public static boolean comprobarfraude( Votante votante) {
        return true;
    }

    public static void contabilizardatosencuenta(int opcion) {

    }

    public void recuento() {

    }


}
