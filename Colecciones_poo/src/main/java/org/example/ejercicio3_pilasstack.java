package org.example;

import java.util.Stack;

public class ejercicio3_pilasstack {

    public static boolean esBalanceado(String expresion) {
        Stack<Character> pilacaracteres = new Stack<>();
        for (int i =0; i<expresion.length(); i++){
           char caracter = expresion.charAt(i);

           if (caracter == '('){
               pilacaracteres.push(caracter);

           } else if (caracter == ')') {
               if (pilacaracteres.isEmpty()){  // si la pila esta vacia la expresion es incorrecta
                   return false;
               }
               pilacaracteres.pop(); // si no quito un ( de la pisla

           }
        }
        return pilacaracteres.isEmpty();

    }
    public static void main(String[] args) {
        String expresion = "((3+5)*2)";

        System.out.println("es balaceado)" +esBalanceado(expresion));

        }
    }

