package Practicas;

import java.util.Scanner;

public class EdadFuturaConEntrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Hola, como te llamas?");
        String nombre = entrada.nextLine();


        System.out.println("Cuantos Años tienes? ");
        int edadActual = entrada.nextInt();

        int edadFutura = edadActual + 5;

        System.out.println("Hola " + nombre + " En 5 Años Tendrás " + edadFutura + " Años. ");

        entrada.close();

        
    }

}