package Herencia;

public class Docente extends Persona {
    public String  facultadPertenece;
    public String  horasClase;

    //Atributos de la clase padre
    public Docente(String cedula, String nombre, String direccion, String telefono, String email,String facultadPertenece,String horasClase) {
        super(cedula, nombre, direccion, telefono, email);
        this.facultadPertenece = facultadPertenece;
        this.horasClase = horasClase;
    }
    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Facultad: " + facultadPertenece);
        System.out.println("Horas de clase: " + horasClase);
    }
}
