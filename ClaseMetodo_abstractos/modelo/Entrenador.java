package modelo;

public class Entrenador extends Persona {
    private String disciplina;
    private int añosExperiencia;

    public Entrenador(String nombre, String cedula, int edad, String disciplina, int añosExperiencia) {
        super(nombre, cedula, edad);
        this.disciplina = disciplina;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Entrenador: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Años de experiencia: " + añosExperiencia);
    }

    // Getters y setters específicos
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}