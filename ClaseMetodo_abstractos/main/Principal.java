package main;

import servicio.GestionCursos;
import servicio.GestionInscripciones;
import servicio.GestionPersonal;
import util.Menu;
import util.Validaciones;

public class Principal {
    public static void main(String[] args) {
        // Inicialización de servicios
        GestionCursos gestionCursos = new GestionCursos();
        GestionInscripciones gestionInscripciones = new GestionInscripciones();
        GestionPersonal gestionPersonal = new GestionPersonal();

        // Carga inicial de datos de prueba
        inicializarDatos(gestionCursos, gestionPersonal);

        // Mostrar menú principal
        Menu.mostrarMenuPrincipal(gestionCursos, gestionInscripciones, gestionPersonal);
    }

    private static void inicializarDatos(GestionCursos gestionCursos, GestionPersonal gestionPersonal) {
        // Metodo para cargar datos iniciales de prueba
        // Ejemplo de Entrenadores
        gestionPersonal.agregarEntrenador("Juan Perez", "1234567890", 35, "Fútbol", 10);
        gestionPersonal.agregarEntrenador("Ana Gómez", "0987654321", 30, "Natación", 5);
    }
}