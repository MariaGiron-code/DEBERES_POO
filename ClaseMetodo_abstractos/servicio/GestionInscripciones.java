package servicio;

import modelo.Participante;
import modelo.Curso;
import util.Validaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionInscripciones {
    private List<Participante> participantes;
    private Scanner scanner;

    public GestionInscripciones() {
        this.participantes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void registrarParticipante() {
        System.out.println("\n=== REGISTRAR NUEVO PARTICIPANTE ===");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Disciplina de interés: ");
        String disciplina = scanner.nextLine();

        Participante nuevo = new Participante(nombre, cedula, edad, disciplina);
        participantes.add(nuevo);

        System.out.println("Participante registrado con éxito!");
    }

    public void inscribirEnCurso(GestionCursos gestionCursos) {
        System.out.println("\n=== INSCRIPCIÓN EN CURSO ===");

        if (participantes.isEmpty()) {
            System.out.println("No hay participantes registrados.");
            return;
        }

        // Mostrar participantes
        System.out.println("Lista de participantes:");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println((i+1) + ". " + participantes.get(i).getNombre());
        }

        System.out.print("Seleccione participante: ");
        int indiceParticipante = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar buffer

        if (indiceParticipante < 0 || indiceParticipante >= participantes.size()) {
            System.out.println("Índice no válido.");
            return;
        }

        Participante participante = participantes.get(indiceParticipante);

        // Mostrar cursos disponibles para la edad del participante
        gestionCursos.mostrarCursosDisponibles(participante.getEdad());

        System.out.print("Seleccione curso: ");
        int indiceCurso = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar buffer

        Curso cursoSeleccionado = gestionCursos.getCursoPorIndice(indiceCurso);

        if (cursoSeleccionado != null) {
            if (cursoSeleccionado.inscribirParticipante(participante)) {
                System.out.println("Inscripción exitosa!");
            } else {
                System.out.println("No se pudo inscribir. Verifique cupo o edad.");
            }
        } else {
            System.out.println("Curso no válido.");
        }
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}