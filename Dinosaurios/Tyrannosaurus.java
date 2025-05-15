import java.util.Random;

public class Tyrannosaurus extends Dinosaurio {

    public Tyrannosaurus(String nombre) {
        super(nombre); // Llama al constructor de Dinosaurio
    }

    @Override
    public void atacar(Dinosaurio oponente) {
        int bonificacion = 10; // daño extra por ser un T-Rex
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + bonificacion;
        oponente.recibirDano(dano);
        System.out.println(nombre + " (Tyrannosaurus) muerde ferozmente a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}