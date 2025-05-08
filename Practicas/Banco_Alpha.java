package Practicas;

import java.util.Scanner;

public class Banco_Alpha {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String contraseniaCorrecta = "java1234";
        String intento;

        do {
            System.out.println("Bienvenido al Banco Alpha. Para acceder a su cuenta, por favor ingrese su contraseña:");
            intento = entrada.nextLine();

            if (!intento.equals(contraseniaCorrecta)) {
                System.out.println("Contraseña incorrecta. Vuelva a intentar \n");
            }
        } while (!intento.equals(contraseniaCorrecta));

        System.out.println("Contraseña Correcta. Accediendo a sus datos bancarios. ");
        System.out.println("Saldo Total: 5.000.000 ");

        entrada.close();
    }
}
