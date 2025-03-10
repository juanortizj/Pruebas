import java.util.Scanner;

class Parqueadero {
    private String[] puestos = new String[20];
    private int[] tiempos = new int[20];
    private Scanner scanner = new Scanner(System.in);
        //Declarando las variables de tiempo y puestos
    public void menu() {
        int opcion;
        do {
            System.out.println("\nTarifador de Parqueadero");
            System.out.println("1. Registrar Moto");
            System.out.println("2. Cobrar Estacionamiento");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            //Este es el menú, estan las opciones.
            switch (opcion) {
                case 1:
                    registrarMoto();
                    break;
                case 2:
                    cobrarEstacionamiento();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }   /*
                Yo utilice switch para que el usuario escoja una de las 3 opciones que
                 estan disponibles
             */
        } while (opcion != 3);
    }

    private void registrarMoto() {
        System.out.println("Registro de moto.");
        mostrarpuestos();
        System.out.println("Ingrese en qué puesto quiere estar (0-" + (puestos.length - 1) + "):");
        int puesto = scanner.nextInt();
        scanner.nextLine();

        if (puesto < 0 || puesto >= puestos.length) {
            System.out.println("Puesto Inválido");
            return;
        }

        if (puestos[puesto] != null) {
            System.out.println("Puesto Ocupado.");
            return;
        }

        System.out.println("Ingrese la placa de su moto: ");
        String placa = scanner.nextLine();
        System.out.println("Ingrese el tiempo que va a solicitar nuestros servicios en minutos por favor: ");
        int tiempo = scanner.nextInt();
        scanner.nextLine();

        puestos[puesto] = placa;
        tiempos[puesto] = tiempo;
        System.out.println("Moto registrada exitosamente en el puesto " + puesto);
    }
    /*
     * Esta parte muestra los 19 puestos del parqueadero, le pide al
     * usuario que escoja un puesto, mira a ver si el puesto que escogió
     * la persona es valido y si no es valido lanza un error y vuelve al menú principal, 
     * si el puesto existe y esta disponible pide la placa del vehiculo y el tiempo
     * que este va a estar en el parqueadero.
     */
    private void cobrarEstacionamiento() {
        System.out.println("Cobro de estacionamiento");
        mostrarpuestos();
        System.out.println("Ingrese el puesto que eligió para hacerle el cobro: ");
        int puesto = scanner.nextInt();
        scanner.nextLine();

        if (puesto < 0 || puesto >= puestos.length || puestos[puesto] == null) {
            System.out.println("El puesto seleccionado está vacío o no existe.");
            return;
        }

        int tiempo = tiempos[puesto];
        int costo = calcularTarifa(tiempo);

        System.out.println("Moto con la identificación " + puestos[puesto] + ". Lo que debe pagar es: $" + costo);

        puestos[puesto] = null;
        tiempos[puesto] = 0;
    }
    /*
     * En esta parte muestra los puestos ocupados, le pide al usuario que 
     * digite el numero de parqueadero donde tiene su vehiculo y le hace el respectivo
     * cobro, muestra el total a pagar y libera el puesto null = 0 en puestos[] y en tiempos[]
     */

    private int calcularTarifa(int minutos) {
        if (minutos <= 30) {
            return 0;
        } else if (minutos <= 60) {
            return 800;
        } else {
            return 2000;
        }
    } //Esta es la operación del cobro del estacionamiento.

    private void mostrarpuestos() {
        System.out.println("Puestos disponibles:");
        for (int i = 0; i < puestos.length; i++) {
            System.out.println("Lugar de estacionamiento " + i + ": " + (puestos[i] == null ? "Disponible" : "Ocupado - " + puestos[i]));
        }
    }
}/*
Muestra los estados de los puestos, si esta libre lo muestra como libre,
pero sino muestra la placa del vehiculo.
 */

public class prueba1 {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        parqueadero.menu();
    }
}/*
*crea la instancia del parqueadero e inicia 
*el codigo con menu()
*/
