package Practicas;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese su peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Por favor ingrese su altura en metros: ");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es:" + imc);


        if (imc < 18.5) {
            System.out.println(" Segun la tabla del IMC (Indice de Masa Corporal) usted tiene bajo peso. ");
        }

        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Segun la tabla del IMC (Indice de Masa Corporal), Usted tiene un peso normal.");
        }

        else if (imc >= 25 && imc < 30) {
            System.out.println("Segun la tabla de IMC (Indice de Masa Corporal), Usted tiene sobrepeso. ");            
        }

        else {
            System.out.println("Segun la tabla del IMC (Indice de Masa Corporal), usted tiene obesidad");
        }

        entrada.close();
        System.out.println("Gracias por usar el programa de IMC (Indice de Masa Corporal).");
    }
}
