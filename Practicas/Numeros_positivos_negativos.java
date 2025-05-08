package Practicas;

import java.util.Scanner;

public class Numeros_positivos_negativos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int positivos = 0;
        int negativos = 0;


        while (numero != 0) {
            System.out.println("Ingresa cualquier numero y oprime 0 para salir.");
            numero = entrada.nextInt();

            if (numero > 0) {
                positivos++;
            }
            else if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Los numeros positivos son: " + positivos );
        System.out.println("Los numeros negativos son: " + negativos );
        entrada.close();    
    }
    
}
