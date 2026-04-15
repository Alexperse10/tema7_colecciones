package org.example;

import java.util.*;

import static org.example.Censo.censo;

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
            if (tipodocumento.equalsIgnoreCase("salir"))
                break;

            System.out.println("Introduce el número del DNI/NIE que has presentado: ");
            String documento = sc.nextLine();

            if (!validarDocumento(documento)) {
                continue;
            }
            Votante votante; // se crea una variable de tipo Votante que no un objeto ya que es abstracta y no se puede crear
            // esto es como una caja que puede guardar un votante.
            if (tipodocumento.equalsIgnoreCase("DNI")){
                votante = new Nacional(documento);
            } else{
                votante = new Extranjero(documento,"mundo");
            }
            if (!verificarEmpadronamiento(votante)){
                continue;
            }

            try {
                comprobarfraude(votante);
            } catch (FraudeExcepcion e){
                System.out.println(e.getMessage());
                continue;
            }
            String respuesta;
            do {
            System.out.println("votatne naciona con dni "+votante+ "realizando voto");
            System.out.println("si o no a la guerra?");
            respuesta = sc.nextLine();

            }while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
            }

            }


    public static boolean validarDocumento (String documento) {
        if (!documento.matches("\\d{8}[A-Za-z]")){
            System.out.println("el dni/nie no es correcto");
            return false;   // explicacion del return si el documento tiene un formato incorrecto entra el return false
            // si el documento es correcto entonces ejecuta el return true y no entra el if
            // return true esta todo bien y return false hay un error.
        }
        return true;
    }


    public static boolean verificarEmpadronamiento(Votante votante) {
        for (Votante votante_ : Censo.getCenso()) {
            if (votante_.equals(votante)) {
                System.out.println("Votante esta censado correctamente");
                return true;
            }

        }
        System.out.println("la persona no esta empadronada");
        return false;
    }

    public static boolean comprobarfraude( Votante votante) {
        System.out.println("comprobando datos...");
        if (votante.isVotado()) {
            throw new FraudeExcepcion("!Aviso a la guardia civil, intento doble voto detectado");


        }
        for (Votante vot : Censo.getCenso()){
            if (vot.equals(votante)){
                System.out.println(vot.getNombre() + " puede votar");
            }
        }
        return true;
    }


    public static void contabilizardatosencuenta(int opcion) {

    }

    public void recuento() {

    }


}
