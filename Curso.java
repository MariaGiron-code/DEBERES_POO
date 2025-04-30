public class Curso {
    String nombreCurso;
    String code;
    int creditos;

    public void infoCurso() {
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Código del curso: " + code);
        System.out.println("Créditos del curso: " + creditos);
    }
    public void actualizarCreditos() {
        System.out.println("Nuevos créditos del curso: " + creditos);
    }
    //CONSTRUCTOR
    public Curso(String nombreCurso, String code, int creditos) {
        this.nombreCurso = nombreCurso;
        this.code = code;
        this.creditos = creditos;
    }
}
