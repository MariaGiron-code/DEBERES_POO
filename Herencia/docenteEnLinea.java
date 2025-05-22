package Herencia;

public class docenteEnLinea extends Persona {

    //mostrar la información personal del docente sin el telefono
    public docenteEnLinea(String cedula, String nombre, String direccion, String telefono, String email) {
        super(cedula, nombre, direccion, telefono, email);
        this.telefono = telefono;
    }
}
