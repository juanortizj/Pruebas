package Practicas;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota;
        double suma = 0;
        int cantidad = 0;

        do {
            System.out.println("Ingrese las notas obtenidas entre 0 a 5 y si quieres salir ingresa un numero negativo. ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 5) {
                suma += nota;
                cantidad++;
            }
            else if(nota >= 6){
                System.out.println("Nota invalida, solo se permiten 5 notas.");
            }
        } while (nota >= 0);

        if (cantidad > 0) {
            Double promedio = suma / cantidad;
            System.out.println("El promedio de las "+ cantidad + " notas ingresadas es de: " + promedio);            
        }
        entrada.close();
    }
    
}
