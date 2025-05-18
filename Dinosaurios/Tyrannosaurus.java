import java.util.Random;

// Clase Tyrannosaurus que hereda de Dinosaurio
public class Tyrannosaurus extends Dinosaurio {

    // Constructor: inicializa el nombre llamando al constructor de la clase padre
    public Tyrannosaurus(String nombre) {
        super(nombre); // Llama al constructor de Dinosaurio
    }

    // Sobrescribe el método atacar para darle una bonificación de daño al T-Rex
    @Override
    public void atacar(Dinosaurio oponente) {
        int bonificacion = 10; // Daño extra por ser un T-Rex (ataque más fuerte)
        Random rand = new Random();

        // Cálculo del daño: daño base aleatorio más la bonificación
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + bonificacion;

        // Aplica el daño al oponente
        oponente.recibirDano(dano);

        // Mensaje personalizado para el ataque del T-Rex
        System.out.println(nombre + " (Tyrannosaurus) muerde ferozmente a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
