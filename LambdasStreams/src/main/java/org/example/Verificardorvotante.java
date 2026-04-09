package org.example;

public class Verificardorvotante {
    public static void main(String[] args) {
        Verificarvoto verificador = (nombre, edad) ->edad >=18;

        System.out.println(verificador.puedeVotar("alex",20));
        System.out.println(verificador.puedeVotar("maria",15));
    }
}


