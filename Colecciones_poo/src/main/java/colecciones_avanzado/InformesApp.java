package colecciones_avanzado;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InformesApp {
    public static void main(String[] args) {
        Stack<Informes> listainformes = new Stack<>(); // OJOOOO QUE LA LISTA ES DE INFORMES
        Scanner sc = new Scanner(System.in);
        int contador =1;
        listainformes.push(new Informes(101,"redactar acta","ADMINISTRATIVO"));
        listainformes.push(new Informes(102,"balance","EMPRESARIAL"));
        listainformes.push(new Informes(103,"Redactar el acta","EMPRESARIAL"));
        listainformes.push(new Informes(104,"Redactar el acta","ADMINISTRATIVO"));
        listainformes.push(new Informes(105,"Redactar el acta","PERSONAL"));

        for (Informes informes_ : listainformes){
            System.out.println(contador+ " "+informes_);
            contador++;
        }

        while (!listainformes.isEmpty()){
            System.out.println(listainformes.pop());
        }

       listainformes.push(new Informes(200,"balance","ADMINISTRATIVO"));
        listainformes.push(new Informes(201,"ir al medico","PERSONAL"));
        listainformes.push(new Informes(202,"reunion con jefes","ADMINISTRATIVO"));


        for (Informes informes_ : listainformes){
            System.out.println(informes_);
        }

        while (!listainformes.empty()){
            System.out.println("orden de salida "+listainformes.pop());

        }

        Stack<Informes> pilacontar = new Stack<>();

        pilacontar.push(new Informes(1,"ver el informe","ADMINISTRATIVO"));
        pilacontar.push(new Informes(2,"gestion personal","PERSONAL"));
        pilacontar.push(new Informes(1,"revisar expediente", "PERSONAL"));


        for (Informes contarinf : pilacontar){
            System.out.println(contarinf);
        }





    }
}
