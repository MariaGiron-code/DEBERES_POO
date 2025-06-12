package Modelo;

public abstract class Curso {
        protected String nombre;
        protected int duracionSemanas;
        protected double precio;
        protected Docente docente;

        public Curso(String nombre, int duracionSemanas, double precio, Docente docente) {
            this.nombre = nombre;
            this.duracionSemanas = duracionSemanas;
            this.precio = precio;
            this.docente = docente;
        }

        // Getters y setters
        public void asignarDocente(Docente docente) {
            this.docente = docente;
        }
        public double getPrecio() {
            return precio;
        }

        public void mostrarResumen() {
            System.out.println("Curso: " + nombre);
            System.out.println("Duración: " + duracionSemanas + " semanas");
            System.out.println("Precio: $" + precio);
            if (docente != null) {
                System.out.println("Docente: " + docente.getNombre());
            } else {
                System.out.println("Docente no asignado");
            }
        }

}
