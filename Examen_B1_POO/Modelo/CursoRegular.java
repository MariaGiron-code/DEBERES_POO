package Modelo;

public class CursoRegular extends Curso {

    public CursoRegular(String nombre, int duracionSemanas, double precio, Docente docente) {
        super(nombre, duracionSemanas, precio, docente);
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Tipo: Curso Regular");
    }
}
