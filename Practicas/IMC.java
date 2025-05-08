package Practicas;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese su peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Porfavor ingrese su altura en metros: ");
        double altura = entrada.nextDouble();

        double imc peso / (altura * altura);
        System.out.println("Su IMC es:" + imc);


        if (imc < 18.5) {
            System.out.println(" Segun la tabla del IMC (Indice de Masa Corporal) ussted tiene bajo peso. ");
        }

        if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Segun la tabla")
        }
    }
}
