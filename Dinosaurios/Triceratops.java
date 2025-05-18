import java.util.Random;

// Clase Triceratops que hereda de Dinosaurio
public class Triceratops extends Dinosaurio {

    // Constructor: llama al constructor de la clase padre con el nombre
    public Triceratops(String nombre) {
        super(nombre);
    }

    // Sobrescribe el método atacar para usar un mensaje específico de Triceratops
    @Override
    public void atacar(Dinosaurio oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Cálculo aleatorio del daño

        // Mensaje personalizado para el ataque del Triceratops
        System.out.println(nombre + " (Triceratops) embiste con sus cuernos a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");

        // Aplica el daño al oponente
        oponente.recibirDano(dano);
    }
}
