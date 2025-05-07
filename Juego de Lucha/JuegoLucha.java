import java.util.Scanner;
 
 public class JuegoLucha {
     private Personaje jugador1;
     private Personaje jugador2;
 
     public JuegoLucha(Personaje jugador1, Personaje jugador2) {
         this.jugador1 = jugador1;
         this.jugador2 = jugador2;
     }
 
     public void iniciarPelea() {
         System.out.println("La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "...");
 
         while (jugador1.estaVivo() && jugador2.estaVivo()) {
             turno(jugador1, jugador2);
             if (jugador2.estaVivo()) {
                 turno(jugador2, jugador1);
             }
         }
 
         if (jugador1.estaVivo()) {
             System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
         } else {
             System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
         }
     }
 
     private void turno(Personaje atacante, Personaje defensor) {
         System.out.println("\nTurno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
         atacante.atacar(defensor);
         System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
     }
 
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el nombre del jugador 1 (Guerrero): ");
             String nombre1 = scanner.nextLine();
             Personaje p1 = new Guerrero(nombre1);
 
             System.out.print("Introduce el nombre del jugador 2 (Base): ");
             String nombre2 = scanner.nextLine();
             Personaje p2 = new Personaje(nombre2);
 
             JuegoLucha juego = new JuegoLucha(p1, p2);
             juego.iniciarPelea();
         }
     }
 }

 