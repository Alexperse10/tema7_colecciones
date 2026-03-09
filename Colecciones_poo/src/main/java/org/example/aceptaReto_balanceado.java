package org.example;

import java.util.Stack;

public class aceptaReto_balanceado {
    public static boolean esbalanceado(String expresion) {
        Stack <Character> pilacaracteres = new Stack<>();
        for (int i =0; i<expresion.length(); i++){
            char caracteres = expresion.charAt(i);
            if (caracteres == '('){
                pilacaracteres.push(caracteres);
            } else if (caracteres == ')') {
                if (pilacaracteres.empty()) { // hacemos una condicion que dice que si hay un parentesis de cierre
                    // estando la pila vacia debe de devolver un false.
                    return false;
                }
                pilacaracteres.pop();
            }
        }
        return pilacaracteres.empty();  // al terminar de recorrer la pila si esta está vacia es correcto
    }

    public static void main(String[] args) {
        String expresion = "((2+3)*(5-1))"; //
        System.out.println(esbalanceado(expresion));
    }
}
