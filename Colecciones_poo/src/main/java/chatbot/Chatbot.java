package chatbot;

import java.util.Scanner;

public class Chatbot {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

       Chatbot bot = new Chatbot();
        bot.iniciar();

    }

    public void iniciar(){
        String entrada;
        System.out.println("Bienvenido! Escribe salir cuando quieras acabar la conversacion...");
        do {
            System.out.println("tu:");
            entrada = sc.nextLine();
            responder(entrada);
        }while (!entrada.equals("salir"));
        System.out.println("chatbot adios");
    }
    private void responder(String entrada){
        if (entrada.contains("hola") || entrada.contains("buenas")){
            System.out.println("chatbot: Hola! en que te puedo ayudar?");
        } else if (entrada.contains("como estas")) {
            System.out.println("Chatbot: estoy bien, gracias");

        } else if (entrada.contains("adios")) {
            System.out.println("chatbot: hasta luego");
        } else if (!entrada.contains("salir")) {
            System.out.println("chatbot: no te enitendo");
        }
    }
}
