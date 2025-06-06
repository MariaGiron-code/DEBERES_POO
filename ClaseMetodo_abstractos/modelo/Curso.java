package modelo;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String disciplina;
    private int cupoMaximo;
    private int edadMinima;
    private int edadMaxima;
    private String horario;
    private Entrenador entrenador;
    private ArrayList<Participante> participantes;

    public Curso(String nombre, String disciplina, int edadMinima, int edadMaxima, String horario) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.cupoMaximo = 30; // Cupo fijo según requerimientos
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.horario = horario;
        this.participantes = new ArrayList<>();
    }

    // Método para inscribir participante
    public boolean inscribirParticipante(Participante participante) {
        if (participantes.size() < cupoMaximo &&
                participante.getEdad() >= edadMinima &&
                participante.getEdad() <= edadMaxima) {
            participantes.add(participante);
            return true;
        }
        return false;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    // ... otros getters y setters

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
}