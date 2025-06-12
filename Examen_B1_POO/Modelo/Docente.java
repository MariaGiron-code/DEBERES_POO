package Modelo;
import java.util.*;
public class Docente {
    private String nombre;
    private String especialidad;
    private List<Curso> cursosAsignados;

    public Docente(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosAsignados = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursosAsignados.add(curso);
        curso.asignarDocente(this);
    }
    public void mostrarCursos() {
        System.out.println("Cursos asignados a " + nombre + ":");
        for (Curso curso : cursosAsignados) {
            curso.mostrarResumen();
        }
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
