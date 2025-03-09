import java.util.Scanner;

class Parqueadero {
    private String[] puestos = new String[20];
    private int[] tiempos = new int[20];
    private Scanner scanner = new Scanner(System.in);

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
            }
        } while (opcion != 3);
    }

    private void registrarMoto() {
        System.out.println("Registro de moto.");
        mostrarpuestos();
        System.out.println("Ingrese en qué puesto quiere estar (0-19):");
        int puesto = scanner.nextInt();
        scanner.nextLine();

        if (puesto < 0 || puesto >= 20) {
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

    private void cobrarEstacionamiento() {
        System.out.println("Cobro de estacionamiento");
        mostrarpuestos();
        System.out.println("Ingrese el puesto que eligió para hacerle el cobro: ");
        int puesto = scanner.nextInt();
        scanner.nextLine();

        if (puesto < 0 || puesto >= 20 || puestos[puesto] == null) {
            System.out.println("El puesto seleccionado está vacío o no existe.");
            return;
        }

        int tiempo = tiempos[puesto];
        int costo = calcularTarifa(tiempo);

        System.out.println("Moto con la identificación " + puestos[puesto] + ". Lo que debe pagar es: $" + costo);

        puestos[puesto] = null;
        tiempos[puesto] = 0;
    }

    private int calcularTarifa(int minutos) {
        if (minutos <= 30) {
            return 0;
        } else if (minutos <= 60) {
            return 800;
        } else {
            return 2000;
        }
    }

    private void mostrarpuestos() {
        System.out.println("Puestos disponibles:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Lugar de estacionamiento " + i + ": " + (puestos[i] == null ? "Disponible" : "Ocupado - " + puestos[i]));
        }
    }
}

public class prueba1 {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        parqueadero.menu();
    }
}
