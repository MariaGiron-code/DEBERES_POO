package Herencia;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("123456789", "Maria Girón", "Calle 123", "0987654321", "mary@email.com", "Informatica", "Tercer Nivel");

        //Mostrar la información personal del estudiante
        System.out.println("------- Información del Estudiante: -------");
        //estudiante1.mostrarInformacionPersonal();

        System.out.println("\n");

        // Crear un objeto de la clase Docente
        Docente docente1 = new Docente("987654321", "Juan Pérez", "Avenida 456", "0123456789", "juan45@gamil.com", "ESFOT", "12 horas");
        System.out.println("-------- Información del Docente: --------");
        //docente1.mostrarInformacionPersonal();

        //Crear objeto de estudiante virtual
        System.out.println("\n");
        estudiante_Virtual estudianteV1 = new estudiante_Virtual( 3, "Matutino", "343243434", "Kevi Simbaña", "Calle 344", "434343", "wddw@gamil.com", "Petroleos", "Primer Semestre");
        estudianteV1.mostrarInformacionPersonal();
        estudianteV1.calcularEdad(2004);
        System.out.println("\n");

        //Crear objeto de estudiante presencial
        estudiante_Presencial estudianteP2 = new estudiante_Presencial("Google Classroom", "Juanito", "343243434", "Dany Carrar", "Calle 344", "434343", "erre@gamil.com", "Petroleos", "Primer Semestre");
        estudianteP2.mostrarInformacionPersonal();
        estudianteP2.calcularEdad(2004);
        System.out.println("\n");

        //Crear objeto de docente en linea
        docenteEnLinea docenteEnLinea1 = new docenteEnLinea("343243434", "Dany Carrar", "Calle 344", "434343", "docente@gaml.com");
        docenteEnLinea1.mostrarInformacionPersonal();

    }
}