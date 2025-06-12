
package Vista;
import Modelo.CursoCertificado;
import Modelo.CursoRegular;
import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.Curso;

import java.util.*;
public class Main {
    // Creacion de las listas para docentes y cursos
    private static List docentes = new ArrayList <>();
    private static List cursos = new ArrayList <>();
    public static void main(String[] args) {
// Creacion de los docentes predefinidos
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

// Creacion de los docentes predefinidos
        CursoRegular cursos1 = new CursoRegular("Programcion con PYTHON", 1, 25, docente1);
        CursoRegular cursos2 = new CursoRegular("Power BI", 2, 35, docente2);
        CursoRegular cursos3 = new CursoRegular("Electricida Basica", 2, 40, docente3);
        CursoCertificado cursos4 = new CursoCertificado("Farmacologia", 4, 65, docente4, true);
        CursoCertificado cursos5 = new CursoCertificado("Fintas brasileñas", 4, 79.99, docente5, true);
// Añadir docentes a la lista
        cursos.add(cursos1);
        cursos.add(cursos2);
        cursos.add(cursos3);
        cursos.add(cursos4);
        cursos.add(cursos5);

// Registro de estudiantes
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el su nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();
        System.out.println("Ingrese el edad: ");
        int edad = sc.nextInt();
        Estudiante estudiante = new Estudiante(nombre,edad, matricula);
    }
}