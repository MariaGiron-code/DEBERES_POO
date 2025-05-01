package Practica4;

public class Ciclista {
    public String nombre;
    public int edad;
    public double kilometrosRecorridos;

    public Ciclista(String nombre, int edad, double kilometrosRecorridos) {
        this.nombre = nombre;
        this.edad = edad;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Kilómetros recorridos: " + kilometrosRecorridos + " km");
    }

    public void actualizarKilometros(double nuevosKilometros) {
        this.kilometrosRecorridos += nuevosKilometros;
        System.out.println("Kilómetros actualizados. Total: " + kilometrosRecorridos + " km");
    }

    public double calcularPromedioMensual() {
        return kilometrosRecorridos / 12;
    }
}
