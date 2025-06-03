package Herencia.herencia_sysBanco;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema bancario");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrarse como Cliente");
        System.out.println("2. Ingresar como Cliente");
        System.out.println("3. Ingresar como Empleado");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese su nombre:");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese su cédula:");
                String cedula = scanner.nextLine();
                System.out.println("Ingrese su dirección:");
                String direccion = scanner.nextLine();
                System.out.println("Ingrese su teléfono:");
                String telefono = scanner.nextLine();

                Cliente cliente = new Cliente(nombre, cedula, direccion, telefono);
                cliente.mostrarRol();
                System.out.println("Cliente registrado con éxito.");
                break;

            case 2:
                System.out.println("Funcionalidad de acceso de cliente en desarrollo.");
                break;

            case 3:
                System.out.println("Funcionalidad de acceso de empleado en desarrollo.");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

}
