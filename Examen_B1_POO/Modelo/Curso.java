package Modelo;

public abstract class Curso {
    private String nombre;
    private int duracionSemanas;
    private double precio;
    private Docente docente;

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

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Docente getDocente() {
        return docente;
    }
}


