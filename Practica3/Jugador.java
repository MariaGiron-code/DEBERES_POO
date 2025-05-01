package Practica3;

public class Jugador {
    public String nombre;
    public int numero;
    public String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Posición: " + posicion);
    }

    public void actualizarPosicion(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
        System.out.println("Posición actualizada a: " + nuevaPosicion);
    }
}
