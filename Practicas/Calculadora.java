package Practicas;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Porfa, ingresa el primer valor numerico: ");
        int PrimerValor = entrada.nextInt();

        System.out.println("Porfa, ingresa el segundo valor numerico: ");
        int SegundoValor = entrada.nextInt();

        int Resultado = 0;

        Resultado = PrimerValor * SegundoValor;
        System.out.println("El resultado de la suma es: " + Resultado);

        entrada.close();
    }
}