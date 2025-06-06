package modelo;

import java.util.HashMap;
import java.util.Map;

public class Cancha {
    private String nombre;
    private String disciplina;
    private Map<String, Curso> horarios; // Clave: horario, Valor: curso asignado

    public Cancha(String nombre, String disciplina) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.horarios = new HashMap<>();
    }

    public boolean asignarCurso(Curso curso) {
        if (horarios.containsKey(curso.getHorario())) {
            return false; // Horario ocupado
        }
        horarios.put(curso.getHorario(), curso);
        return true;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Map<String, Curso> getHorarios() {
        return horarios;
    }
}