package Modelo;

public class Evaluacion {
    private Curso curso;
    private Estudiante estudiante;
    private double nota;

    public Evaluacion(Curso curso, Estudiante estudiante, double nota) {
        this.curso = curso;
        this.estudiante = estudiante;
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            this.nota = 0;
            System.out.println("Nota inválida, debe estar entre 0 y 10");
        }
    }

    public String getResultado() {
        if (nota >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
