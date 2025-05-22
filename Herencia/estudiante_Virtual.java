package Herencia;

public class estudiante_Virtual extends Estudiante {
    public int horasPresenciales;
    public String horario;

    public estudiante_Virtual (int horasPresenciales, String horario,String cedula, String nombre, String direccion, String telefono, String email,String carrera,String nivel) {
        super(cedula, nombre, direccion, telefono, email, carrera,nivel);
        this.horasPresenciales = horasPresenciales;
        this.horario = horario;
    }
    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Horas Presenciales de estudio a la semana: " + horasPresenciales);
        System.out.println("Horario de clases: " + horario);
    }
    @Override
    public int calcularEdad(int anioNacimiento) {
        super.calcularEdad(anioNacimiento);
        int anioActual = 2025;
        return anioActual - anioNacimiento;
    }

}
