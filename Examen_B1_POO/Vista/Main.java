import Modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Creación de las listas para docentes, cursos y estudiantes
    private static List<Docente> docentes = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicialización de datos predefinidos
        inicializarDatos();

        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch(opcion) {
                case 1:
                    gestionarDocentes();
                    break;
                case 2:
                    gestionarCursos();
                    break;
                case 3:
                    gestionarEstudiantes();
                    break;
                case 4:
                    mostrarInformacionCompleta();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while(opcion != 0);
    }

    private static void inicializarDatos() {
        // Creación de los docentes predefinidos
        Docente docente1 = new Docente("Eduardo Ganchala", "Software");
        Docente docente2 = new Docente("Maria Giron", "Analisis de Datos");
        Docente docente3 = new Docente("Juan Perez", "Mecanico");
        Docente docente4 = new Docente("Pedro Ramos", "Medicina");
        Docente docente5 = new Docente("Xabi Alonso", "Deportes");

        // Añadir docentes a la lista
        docentes.add(docente1);
        docentes.add(docente2);
        docentes.add(docente3);
        docentes.add(docente4);
        docentes.add(docente5);

        // Creación de los cursos predefinidos
        CursoRegular cursos1 = new CursoRegular("Programacion con PYTHON", 1, 25, docente1);
        CursoRegular cursos2 = new CursoRegular("Power BI", 2, 35, docente2);
        CursoRegular cursos3 = new CursoRegular("Electricidad Basica", 2, 40, docente3);
        CursoCertificado cursos4 = new CursoCertificado("Farmacologia", 4, 65, docente4, true);
        CursoCertificado cursos5 = new CursoCertificado("Fintas brasileñas", 4, 79.99, docente5, true);

        // Añadir cursos a la lista
        cursos.add(cursos1);
        cursos.add(cursos2);
        cursos.add(cursos3);
        cursos.add(cursos4);
        cursos.add(cursos5);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n### SISTEMA EPN-PLUS ###");
        System.out.println("1. Gestión de Docentes");
        System.out.println("2. Gestión de Cursos");
        System.out.println("3. Gestión de Estudiantes");
        System.out.println("4. Mostrar Información Completa");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void gestionarDocentes() {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE DOCENTES ---");
            System.out.println("1. Listar docentes");
            System.out.println("2. Agregar nuevo docente");
            System.out.println("3. Buscar docente por especialidad");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    listarDocentes();
                    break;
                case 2:
                    agregarDocente();
                    break;
                case 3:
                    buscarDocentePorEspecialidad();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while(opcion != 0);
    }

    private static void listarDocentes() {
        System.out.println("\n--- LISTADO DE DOCENTES ---");
        for (int i = 0; i < docentes.size(); i++) {
            System.out.println((i + 1) + ". " + docentes.get(i).getNombre() +
                    " - " + docentes.get(i).getEspecialidad());
        }
    }

    private static void agregarDocente() {
        System.out.println("\n--- AGREGAR NUEVO DOCENTE ---");
        System.out.print("Nombre del docente: ");
        String nombre = sc.nextLine();

        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();

        Docente nuevoDocente = new Docente(nombre, especialidad);
        docentes.add(nuevoDocente);
        System.out.println("Docente agregado con éxito!");
    }

    private static void buscarDocentePorEspecialidad() {
        System.out.print("\nIngrese la especialidad a buscar: ");
        String especialidad = sc.nextLine();

        System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
        boolean encontrado = false;
        for (Docente docente : docentes) {
            if (docente.getEspecialidad().equalsIgnoreCase(especialidad)) {
                System.out.println(docente.getNombre() + " - " + docente.getEspecialidad());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron docentes con esa especialidad.");
        }
    }

    private static void gestionarCursos() {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE CURSOS ---");
            System.out.println("1. Listar cursos");
            System.out.println("2. Agregar curso regular");
            System.out.println("3. Agregar curso certificado");
            System.out.println("4. Asignar docente a curso");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    listarCursos();
                    break;
                case 2:
                    agregarCursoRegular();
                    break;
                case 3:
                    agregarCursoCertificado();
                    break;
                case 4:
                    asignarDocenteACurso();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while(opcion != 0);
    }

    private static void listarCursos() {
        System.out.println("\n--- LISTADO DE CURSOS ---");
        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);
            System.out.print((i + 1) + ". " + curso.getNombre() +
                    " (" + curso.getClass().getSimpleName() + ")");

            if (curso.getDocente() != null) {
                System.out.println(" - Docente: " + curso.getDocente().getNombre());
            } else {
                System.out.println(" - Sin docente asignado");
            }

            if (curso instanceof CursoCertificado) {
                System.out.println("   Precio final: $" + ((CursoCertificado)curso).calcularPrecioFinal());
            } else {
                System.out.println("   Precio: $" + curso.getPrecio());
            }
        }
    }

    private static void agregarCursoRegular() {
        System.out.println("\n--- AGREGAR CURSO REGULAR ---");
        System.out.print("Nombre del curso: ");
        String nombre = sc.nextLine();

        System.out.print("Duración (semanas): ");
        int duracion = sc.nextInt();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        listarDocentes();
        System.out.print("Seleccione el número del docente: ");
        int indiceDocente = sc.nextInt() - 1;
        sc.nextLine();

        if (indiceDocente >= 0 && indiceDocente < docentes.size()) {
            CursoRegular nuevoCurso = new CursoRegular(nombre, duracion, precio, docentes.get(indiceDocente));
            cursos.add(nuevoCurso);
            System.out.println("Curso regular agregado con éxito!");
        } else {
            System.out.println("Índice de docente no válido.");
        }
    }

    private static void agregarCursoCertificado() {
        System.out.println("\n--- AGREGAR CURSO CERTIFICADO ---");
        System.out.print("Nombre del curso: ");
        String nombre = sc.nextLine();

        System.out.print("Duración (semanas): ");
        int duracion = sc.nextInt();

        System.out.print("Precio base: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        listarDocentes();
        System.out.print("Seleccione el número del docente: ");
        int indiceDocente = sc.nextInt() - 1;
        sc.nextLine();

        if (indiceDocente >= 0 && indiceDocente < docentes.size()) {
            CursoCertificado nuevoCurso = new CursoCertificado(nombre, duracion, precio,
                    docentes.get(indiceDocente), true);
            cursos.add(nuevoCurso);
            System.out.println("Curso certificado agregado con éxito!");
            System.out.println("Precio final con recargo: $" + nuevoCurso.calcularPrecioFinal());
        } else {
            System.out.println("Índice de docente no válido.");
        }
    }

    private static void asignarDocenteACurso() {
        System.out.println("\n--- ASIGNAR DOCENTE A CURSO ---");
        listarCursos();
        System.out.print("Seleccione el número del curso: ");
        int indiceCurso = sc.nextInt() - 1;
        sc.nextLine();

        if (indiceCurso < 0 || indiceCurso >= cursos.size()) {
            System.out.println("Índice de curso no válido.");
            return;
        }

        listarDocentes();
        System.out.print("Seleccione el número del docente: ");
        int indiceDocente = sc.nextInt() - 1;
        sc.nextLine();

        if (indiceDocente >= 0 && indiceDocente < docentes.size()) {
            cursos.get(indiceCurso).asignarDocente(docentes.get(indiceDocente));
            System.out.println("Docente asignado con éxito al curso!");
        } else {
            System.out.println("Índice de docente no válido.");
        }
    }

    private static void gestionarEstudiantes() {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE ESTUDIANTES ---");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while(opcion != 0);
    }

    private static void registrarEstudiante() {
        System.out.println("\n--- REGISTRAR ESTUDIANTE ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, matricula);
        estudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante registrado con éxito!");
    }

    private static void listarEstudiantes() {
        System.out.println("\n--- LISTADO DE ESTUDIANTES ---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                Estudiante est = estudiantes.get(i);
                System.out.println((i + 1) + ". " + est.getNombre() +
                        " - Matrícula: " + est.getMatricula() +
                        " - Edad: " + est.getEdad());
            }
        }
    }

    private static void mostrarInformacionCompleta() {
        System.out.println("\n### INFORMACIÓN COMPLETA DEL SISTEMA ###");

        System.out.println("\n--- DOCENTES ---");
        listarDocentes();

        System.out.println("\n--- CURSOS ---");
        listarCursos();

        System.out.println("\n--- ESTUDIANTES ---");
        listarEstudiantes();
    }
}