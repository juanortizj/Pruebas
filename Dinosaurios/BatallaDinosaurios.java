import java.util.Scanner;

//Clase que representa una batalla entre dos dinosaurios
public class BatallaDinosaurios {
    private Dinosaurio dino1;
    private Dinosaurio dino2;

    // Constructor: recibe dos dinosaurios y los asigna al combate
    public BatallaDinosaurios(Dinosaurio d1, Dinosaurio d2) {
        this.dino1 = d1;
        this.dino2 = d2;
    }

    // Inicia la pelea y alterna turnos hasta que uno de los dos pierda
    public void iniciarPelea() {
        System.out.println("¡Comienza la batalla entre " + dino1.getNombre() + " y " + dino2.getNombre() + "!");

        // Se repiten los turnos mientras ambos estén vivos
        while (dino1.estaVivo() && dino2.estaVivo()) {
            turno(dino1, dino2); // Dino 1 ataca primero
            if (dino2.estaVivo()) {
                turno(dino2, dino1); // Dino 2 responde si aún vive
            }
        }

        // Anuncia el resultado final
        if (dino1.estaVivo()) {
            System.out.println(dino1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(dino2.getNombre() + " ha ganado la batalla.");
        }
    }

    // Lógica de un turno: un dinosaurio ataca al otro
    private void turno(Dinosaurio atacante, Dinosaurio defensor) {
        System.out.println("\nTurno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor); // Ejecuta el ataque
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }

    // Método principal del programa: configura la batalla y la inicia
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada del primer dinosaurio
        System.out.print("Introduce el nombre del dinosaurio 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Elige su especie (tyrannosaurus/triceratops): ");
        String especie1 = scanner.nextLine().toLowerCase();

        // Crea el dinosaurio 1 según la especie elegida
        Dinosaurio d1 = especie1.equals("triceratops") ? new Triceratops(nombre1) : new Tyrannosaurus(nombre1);

        // Entrada del segundo dinosaurio
        System.out.print("Introduce el nombre del dinosaurio 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Elige su especie (tyrannosaurus/triceratops): ");
        String especie2 = scanner.nextLine().toLowerCase();

        // Crea el dinosaurio 2 según la especie elegida
        Dinosaurio d2 = especie2.equals("triceratops") ? new Triceratops(nombre2) : new Tyrannosaurus(nombre2);

        scanner.close(); // ✅ Buen hábito: cerrar el scanner para liberar recursos

        // Se crea la batalla y se inicia
        BatallaDinosaurios batalla = new BatallaDinosaurios(d1, d2);
        batalla.iniciarPelea();
    }
}
