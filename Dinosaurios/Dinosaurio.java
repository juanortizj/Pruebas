import java.util.Random;

// Clase base que representa un dinosaurio genérico
public class Dinosaurio {
    protected String nombre;
    protected int puntosDeVida;
    protected final int MAX_DANO = 30; // Daño máximo posible por ataque
    protected final int MIN_DANO = 10; // Daño mínimo posible por ataque

    // Constructor: inicializa el nombre y los puntos de vida del dinosaurio
    public Dinosaurio(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Vida inicial estándar
    }

    // Método para atacar a otro dinosaurio (se puede sobrescribir en subclases)
    public void atacar(Dinosaurio oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Cálculo aleatorio del daño
        oponente.recibirDano(dano); // Aplica el daño al oponente
        System.out.println(nombre + " muerde a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    // Método para recibir daño (reduce los puntos de vida)
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0; // Vida mínima es 0
    }

    // Verifica si el dinosaurio sigue vivo (vida > 0)
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del dinosaurio
    public String getNombre() {
        return this.nombre;
    }

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
