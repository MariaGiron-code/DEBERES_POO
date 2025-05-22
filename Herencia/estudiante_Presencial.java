package Herencia;

public class estudiante_Presencial extends Estudiante {
    public String plataforma;
    public String tutorVirtual;

    public estudiante_Presencial(String plataforma, String tutorVirtual, String cedula, String nombre, String direccion, String telefono, String email,String carrera,String nivel) {
        super(cedula, nombre, direccion, telefono, email, carrera,nivel);
        this.plataforma = plataforma;
        this.tutorVirtual = tutorVirtual;
    }
    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Plataforma de estudio: " + plataforma);
        System.out.println("Tutor Virtual: " + tutorVirtual);

    }
    @Override
    public int calcularEdad(int anioNacimiento) {
        super.calcularEdad(anioNacimiento);
        int anioActual = 2025;
        return anioActual - anioNacimiento;
    }
}
