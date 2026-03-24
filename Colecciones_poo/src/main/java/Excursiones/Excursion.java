package Excursiones;

import java.util.*;

public class Excursion {
    Scanner sc = new Scanner(System.in);
    private String nombre_actividad;
    private String localidad;
    private double precio;

    Set<String> profesores = new HashSet<>();
    Set<Estudiante> listaAsistes = new TreeSet<>();

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
    }

    public void insertarProfesor() {
        System.out.println("Introduce el nombre del profesor/a para la excursion en benidorm");
        String profesor = sc.nextLine();
        profesores.add(profesor);
        System.out.println("profesor añadido correctamente a la excursion " + nombre_actividad);
        //profesores.add(); // necesito que le pase un objeto, en este caso creo una variable profesor
    }

    public void inscribirasistente() {
        System.out.println("insertar los nombre");
        String nombre = sc.nextLine();
        System.out.println("insertar apelllidos");
        String apellidos = sc.nextLine();
        System.out.println("insertar curso");
        String curso = sc.nextLine();
        System.out.println("insertar edad");
        int edad = sc.nextInt();
        sc.nextLine();
        listaAsistes.add(new Estudiante(nombre, apellidos, curso, edad));
        System.out.println("añadido correctamente el estudiante " + nombre + " " + apellidos + " " + " del " + curso);
    }

    public double calcularimporte() {
        int contador = 0;

        for (Estudiante contar : listaAsistes) {
            contador++;
        }
        double total = contador * precio;
        System.out.println(total);
        return total;
    }

    public void verAsistente() {
        int contador = 0;
        for (Estudiante asistentes : listaAsistes) {
            contador++;
            System.out.println("[" + contador + "]" + " " + asistentes);

        }
    }

    public void eliminarasistenteporedad(int edad) {
        Iterator<Estudiante> it = listaAsistes.iterator();
        while (it.hasNext()){
            Estudiante asistente = it.next();
            if (asistente.getEdad()<edad){
                it.remove();
            }
        }

            System.out.println("despues de eliminar a los menores de 16 años");
        }


    }


