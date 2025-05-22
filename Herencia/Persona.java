package Herencia;

public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    protected String telefono;
    public String email;

    public Persona(String cedula, String nombre, String direccion, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public void mostrarInformacionPersonal() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }
}
