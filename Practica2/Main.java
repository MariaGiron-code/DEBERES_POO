package Practica2;

public class Main {
    public static void main(String[] args) {
    Libros libro1 = new Libros();
    libro1.titulo = "El Principito";
    libro1.autor = "Antoine de Saint-Exupéry";
    libro1.anioPublicacion = 1943;

    Libros libro2 = new Libros();
    libro2.titulo = "Cien años de soledad";
    libro2.autor = "Gabriel García Márquez";
    libro2.anioPublicacion = 1967;

    // Mostrar información de los libros
    System.out.println("Información del libro 1:");
    libro1.infoLibro();
    System.out.println("\nInformación del libro 2:");
    libro2.infoLibro();

    // Actualizar el año de publicación del libro 1
    libro1.actualizarAnioPublicacion();

    // Mostrar información actualizada del libro 1
    System.out.println("\nInformación actualizada del libro 1:");
    libro1.infoLibro();

    }
}
