import java.util.Random;

public class Triceratops extends Dinosaurio {
    public Triceratops(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Dinosaurio oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        System.out.println(nombre + " (Triceratops) embiste con sus cuernos a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
}