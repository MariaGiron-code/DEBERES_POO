package Practica2;
import java.util.Scanner;
public class Libros {
    String titulo;
    String autor;
    int anioPublicacion;

    //Metodos
    public void infoLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anioPublicacion);
    }
    public void actualizarAnioPublicacion() {
        System.out.println("Ingrese el nuevo año de publicacion del libro 1: ");
        Scanner scanner = new Scanner(System.in);
        anioPublicacion = scanner.nextInt();
        System.out.println("Año de publicacion actualizado a: " + anioPublicacion);
    }
}
