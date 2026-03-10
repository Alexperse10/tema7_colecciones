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

        //for ()


    }
}
