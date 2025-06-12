package Modelo;

public class CursoRegular extends Curso {
    private boolean evaluacionContinua;

    public CursoRegular(String nombre, int duracionSemanas, double precio, boolean evaluacionContinua, Docente docente) {
        super(nombre, duracionSemanas, precio, docente);
        this.evaluacionContinua = evaluacionContinua;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Tipo: Curso Regular");
        System.out.println("Evaluación Continua: " + (evaluacionContinua ? "Sí" : "No"));
    }
}
