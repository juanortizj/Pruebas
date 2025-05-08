package Practicas;

import java.util.Scanner;

public class Bucle {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println(" MENÚ ");
            System.out.println("1. Saludar. ");
            System.out.println("2. Mostrar mi nombre. ");
            System.out.println("3. Salir.");
            System.out.println("Elige una opción: ");

            opcion = entrada.nextInt();


            if (opcion == 1) {
                System.out.println("Hola a todo mundo!");
            }
            else if(opcion == 2){
                System.out.println("Creo que tu nombre es Maria Antonia. ");
            }
            else if(opcion == 3) {
                System.out.println("Saliendo rapido del programa. ");
            }
            else {
                System.out.println("Opción no valida, intente otra vez.");
            }
        } while (opcion != 3);

        entrada.close();
        System.out.println("Programa Finalizado. ");
    }
    
}
