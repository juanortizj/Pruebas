import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {  
            int n, suma = 0;

            for (;;) {
                System.out.print("Ingresa un número: ");
                n = leer.nextInt();
                if (n == 0)
                    break;
                suma += n;
            }

            System.out.println("La suma de los números es: " + suma);
        }  
    }
}