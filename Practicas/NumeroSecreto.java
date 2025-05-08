package Practicas;
import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto {

       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int NumeroSecreto = aleatorio.nextInt(10) + 1;
        int intentos = 0;
        intentos++;

        while (intentos != NumeroSecreto){
            System.out.println("Adivina el numero secreto entre el 1 y el 10. ");
            intentos = entrada.nextInt();

            if (intentos < NumeroSecreto) {
                System.out.println("Muy bajo. Intenta otra vez."); 
            }
            else if (intentos > NumeroSecreto) {
                System.out.println("Muy alto. Intenta otra vez. ");                
            }
            
        }
        System.out.println("Correcto! el numero secreto era: " + NumeroSecreto);
        entrada.close();
       } 
}
