package Practica3;

public class main_Jugador {
        // Clase principal para probar la clase Jugador
        public static void main(String[] args) {
            Jugador jugador1 = new Jugador("Eduardo Ganchala", 7, "Mediocampista");
            Jugador jugador2 = new Jugador("Maria Giron", 15, "Defensa");

            jugador1.mostrarInformacion();
            jugador2.mostrarInformacion();

            jugador1.actualizarPosicion("Delantero");
        }
}
