public class Main {
    public static void main(String[] args) {
        //Objetos de la clase Curso
        Curso curso1 = new Curso("Programación", "PROG101", 3);
        Curso curso2 = new Curso("Matemáticas", "MAT101", 4);

        //Llamada al metodo infoCurso
        curso1.infoCurso();
        curso2.infoCurso();
        //LLamda al metodo actualizarCreditos asiganando el nuevo valor de los creditos
        curso1.creditos = 5;
        curso2.creditos = 3;
        curso1.actualizarCreditos();


    }
}
