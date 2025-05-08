package Practicas;

import java.util.Scanner;
public class Clima {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la temperatura actual: ");
        int temperatura = entrada.nextInt();

        if (temperatura < 0) {
            System.err.println("Esta haciendo mucho frio.");
        }

        if (temperatura > 0 && temperatura < 15) {
            System.out.println("El clima esta muy fresco.");
        }
        if (temperatura >= 16 && temperatura <= 25) {
            System.out.println("El clima esta agradable para hacer deporte.");
        }
        if (temperatura > 26 && temperatura <= 35) {
            System.out.println("El clima esta caliente.");
        }
        if (temperatura > 35) {
            System.out.println("Esta haciendo mucho calor.");
        }

        entrada.close();


    }
    
}
