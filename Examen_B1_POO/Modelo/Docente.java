package Modelo;

public class Docente {
    private String nombre;
    private String especialidad;

    public Docente(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void mostrarPerfil(String especialidad, String nombre) {
        this.especialidad = especialidad;
        this.nombre = nombre;
    }
}
