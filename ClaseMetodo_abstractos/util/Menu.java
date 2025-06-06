package util;

import servicio.GestionCursos;
import servicio.GestionInscripciones;
import servicio.GestionPersonal;
import java.util.Scanner;

public class Menu {
    public static void mostrarMenuPrincipal(GestionCursos gestionCursos,
                                            GestionInscripciones gestionInscripciones,
                                            GestionPersonal gestionPersonal) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE CURSOS DEPORTIVOS ===");
            System.out.println("1. Registrar Participante");
            System.out.println("2. Ver Cursos Disponibles por Edad");
            System.out.println("3. Inscribir en Curso");
            System.out.println("4. Ver Inscritos por Curso");
            System.out.println("5. Ver Horarios de Canchas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionInscripciones.registrarParticipante();
                    break;
                case 2:
                    gestionCursos.mostrarCursosDisponiblesPorEdad();
                    break;
                case 3:
                    gestionInscripciones.inscribirEnCurso(gestionCursos);
                    break;
                case 4:
                    gestionCursos.mostrarInscritosPorCurso();
                    break;
                case 5:
                    gestionCursos.mostrarHorariosCanchas();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
