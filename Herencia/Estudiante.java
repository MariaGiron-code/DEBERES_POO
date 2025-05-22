package Herencia;

public class Estudiante extends Persona {
    public String  carrera;
    public String  nivel;
    public int anioNacimiento = 2004;
    //Atributos de la clase padre
    public Estudiante(String cedula, String nombre, String direccion, String telefono, String email,String carrera,String nivel) {
        super(cedula, nombre, direccion, telefono, email);
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public int calcularEdad(int anioNacimiento) {
        int anioActual = 2025;
        int edad = anioActual - anioNacimiento;
        System.out.println("La edad del estudiante es: " + edad);
        return edad;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
    }
}
