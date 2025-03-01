import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[15];
        int conteo_pares = 0, conteo_impares = 0;

        // Llenar el arreglo y contar pares e impares
        System.out.println("Llenar el arreglo:");
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {
                conteo_pares++;
            } else {
                conteo_impares++;
            }
        }

        // Crear los arreglos con el tamaño adecuado
        int par[] = new int[conteo_pares];
        int impar[] = new int[conteo_impares];

        // Llenar los arreglos de pares e impares
        int index_par = 0, index_impar = 0;
        for (int i = 0; i < 15; i++) {
            if (arreglo[i] % 2 == 0) {
                par[index_par++] = arreglo[i];
            } else {
                impar[index_impar++] = arreglo[i];
            }
        }

        // Mostrar los números pares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < conteo_pares; i++) {
            System.out.print(par[i] + " ");
        }

        // Mostrar los números impares
        System.out.println("\n\nNúmeros impares:");
        for (int i = 0; i < conteo_impares; i++) {
            System.out.print(impar[i] + " ");
        }

        // Cerrar el Scanner
        entrada.close();
    }
}
