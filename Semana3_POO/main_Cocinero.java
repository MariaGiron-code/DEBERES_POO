package Semana3_POO;
import java.util.Scanner;
public class main_Cocinero {
    public static void main(String[] args) {
        //Ingresar datos de los cocineros
        Scanner sc = new Scanner(System.in);
        Cocinero cocinero = new Cocinero();
        Cocinero cocinero2 = new Cocinero();
        Cocinero cocinero3 = new Cocinero();

        System.out.println("Ingrese los datos del cocinero #1:");
        System.out.println("Ingrese el nombre del cocinero:");
        cocinero.nombre = sc.nextLine();
        System.out.println("Ingrese la especialidad del cocinero:");
        cocinero.especialidad = sc.nextLine();
        System.out.println("Ingrese la experiencia del cocinero en años: ");
        cocinero.experiencia = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese los datos del cocinero #2:");
        System.out.println("Ingrese el nombre del cocinero:");
        cocinero2.nombre = sc.nextLine();
        System.out.println("Ingrese la especialidad del cocinero:");
        cocinero2.especialidad = sc.nextLine();
        System.out.println("Ingrese la experiencia del cocinero en años: ");
        cocinero2.experiencia = sc.nextInt();
        sc.nextLine();


        System.out.println("Ingrese los datos del cocinero #3: ");
        System.out.println("Ingrese el nombre del cocinero:");
        cocinero3.nombre = sc.nextLine();
        System.out.println("Ingrese la especialidad del cocinero:");
        cocinero3.especialidad = sc.nextLine();
        System.out.println("Ingrese la experiencia del cocinero en años: ");
        cocinero3.experiencia = sc.nextInt();
        sc.nextLine();

        //Mostrar datos de los cocineros
        System.out.println("Los datos del cocinero #1 son: ");
        cocinero.mostrarInformacion();

        System.out.println("Los datos del cocinero #2 son: ");
        cocinero2.mostrarInformacion();

        System.out.println("Los datos del cocinero #3 son: ");
        cocinero3.mostrarInformacion();

        //Reducir las lines de código
        Cocinero[] cocineros = new Cocinero[3];

        for( int i = 0; i < cocineros.length; i++){
            //Guardamos los datos en una lista llamada cocineros
            cocineros[i] = new Cocinero();

            System.out.println("Ingrese los datos del cocinero #" + (i+1) + ":");
            System.out.println("Ingrese el nombre del cocinero:");
            cocineros[i].nombre = sc.nextLine();

            System.out.println("Ingrese la especialidad del cocinero:");
            cocineros[i].especialidad = sc.nextLine();

            System.out.println("Ingrese la experincia del coicero en años: ");
            cocineros[i].experiencia = sc.nextInt();
            sc.nextLine();



        }


    }

}
