package modelo;

public class Participante extends Persona {
    private String disciplinaInteres;

    public Participante(String nombre, String cedula, int edad, String disciplinaInteres) {
        super(nombre, cedula, edad);
        this.disciplinaInteres = disciplinaInteres;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Participante: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Disciplina de interés: " + disciplinaInteres);
    }

    // Getter y setter específico
    public String getDisciplinaInteres() {
        return disciplinaInteres;
    }

    public void setDisciplinaInteres(String disciplinaInteres) {
        this.disciplinaInteres = disciplinaInteres;
    }
}
