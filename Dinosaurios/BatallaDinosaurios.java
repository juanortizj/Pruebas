import java.util.Scanner;

public class BatallaDinosaurios {
    private Dinosaurio dino1;
    private Dinosaurio dino2;

    public BatallaDinosaurios(Dinosaurio d1, Dinosaurio d2) {
        this.dino1 = d1;
        this.dino2 = d2;
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza la batalla entre " + dino1.getNombre() + " y " + dino2.getNombre() + "!");

        while (dino1.estaVivo() && dino2.estaVivo()) {
            turno(dino1, dino2);
            if (dino2.estaVivo()) {
                turno(dino2, dino1);
            }
        }

        if (dino1.estaVivo()) {
            System.out.println(dino1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(dino2.getNombre() + " ha ganado la batalla.");
        }
    }

    private void turno(Dinosaurio atacante, Dinosaurio defensor) {
        System.out.println("\nTurno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el nombre del dinosaurio 1: ");
    String nombre1 = scanner.nextLine();
    System.out.print("Elige su especie (tyrannosaurus/triceratops): ");
    String especie1 = scanner.nextLine().toLowerCase();

    Dinosaurio d1 = especie1.equals("triceratops") ? new Triceratops(nombre1) : new Tyrannosaurus(nombre1);

    System.out.print("Introduce el nombre del dinosaurio 2: ");
    String nombre2 = scanner.nextLine();
    System.out.print("Elige su especie (tyrannosaurus/triceratops): ");
    String especie2 = scanner.nextLine().toLowerCase();

    Dinosaurio d2 = especie2.equals("triceratops") ? new Triceratops(nombre2) : new Tyrannosaurus(nombre2);

    scanner.close(); // ✅ Cierra el recurso

    BatallaDinosaurios batalla = new BatallaDinosaurios(d1, d2);
    batalla.iniciarPelea();
    }
}