package Modelo;

public class Matricula {
    private Curso curso;
    private Estudiante estudiante;
    private String fecha;

    public Matricula(Curso curso, Estudiante estudiante, String fecha) {
        this.curso = curso;
        this.estudiante = estudiante;
        this.fecha = fecha;
    }

    public void registrarEvaluacion(Evaluacion evaluacion) {
        System.out.println("Evaluación registrada para " + estudiante.getNombre());
    }

    public void mostrarDetalle() {
        System.out.println("Matrícula:");
        estudiante.mostrarDatos();
        curso.mostrarResumen();
        System.out.println("Fecha: " + fecha);
    }
}
