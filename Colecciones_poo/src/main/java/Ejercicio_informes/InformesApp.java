package Ejercicio_informes;

import java.util.*;

public class InformesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Informes> pilainformes = new Stack<>();
        //for (int i =0; i<5; i++){
           // System.out.println("introduce el codigo");
           // int codigo = sc.nextInt();
           // sc.nextLine();
           // System.out.println("introduce la descripcion");
           // String descripcion = sc.nextLine();
           // System.out.println("introduce el tipo");
            //Tipo tipotexto = Tipo.valueOf(sc.nextLine().toUpperCase());


          //  pilainformes.push(new Informes(codigo,descripcion,tipotexto));
        //}
        pilainformes.push(new Informes(1,"pagar",Tipo.ADMINISTRATIVO));
        pilainformes.push(new Informes(2,"recoger",Tipo.EMPRESARIAL));
        pilainformes.push(new Informes(3,"cobrar",Tipo.PERSONAL));
        pilainformes.push(new Informes(1,"pagar",Tipo.ADMINISTRATIVO));
        pilainformes.push(new Informes(2,"medico",Tipo.EMPRESARIAL));

        System.out.println("---- Lista de informes 1 ------");
        for (Informes informes : pilainformes){
            System.out.println(informes);
        }

        System.out.println("---- lista informe despachar ----");
        while (!pilainformes.isEmpty()){
            System.out.println(pilainformes.pop());
        }


        pilainformes.push(new Informes(3,"cobrar",Tipo.PERSONAL));
        pilainformes.push(new Informes(1,"pagar",Tipo.ADMINISTRATIVO));
        pilainformes.push(new Informes(2,"medico",Tipo.EMPRESARIAL));

        while (!pilainformes.isEmpty()){
            System.out.println(pilainformes.pop());
        }

        Stack<Informes> pilarcontador = new Stack<>();
        pilarcontador.push(new Informes(1,"Revisar expediente", Tipo.ADMINISTRATIVO));
        pilarcontador.push(new Informes(2,"Informe empresa", Tipo.EMPRESARIAL));
        pilarcontador.push(new Informes(1,"Revisar expediente", Tipo.ADMINISTRATIVO));
        pilarcontador.push(new Informes(3,"Gestión personal", Tipo.PERSONAL));

        System.out.println("tipos de tareas distintas "+contartipos(pilarcontador));



        }
    public static int contartipos(Stack<Informes> pila){
        Set<String> tipos = new HashSet<>();

        for (Informes inf : pila){
            String clave = inf.getCodigo() + "-" + inf.getTipo();
            tipos.add(clave);
        }

        return tipos.size();
    }

    }

