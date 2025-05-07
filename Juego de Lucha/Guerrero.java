import java.util.Random;

 public class Guerrero extends Personaje {
     public Guerrero(String nombre) {
         super(nombre);
     }
 
     @Override
     public void atacar(Personaje oponente) {
         int bonificacion = 5; // más daño fijo
         Random rand = new Random();
         int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + bonificacion;
         oponente.recibirDano(dano);
         System.out.println(nombre + " (Guerrero) golpea brutalmente a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
     }
 }