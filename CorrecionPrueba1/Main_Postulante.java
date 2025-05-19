package CorrecionPrueba1;

public class Main_Postulante {
        public static void main(String[] args) {
            // Creación de objetos con distintos constructores
            Postulante postulante1 = new Postulante("María", "López", "Ingeniería en Sistemas");
            Postulante postulante2 = new Postulante("Jorge", "Pérez", 19, "0987654321", "jorge@example.com",
                    "Ecuatoriana", "Alta", "Medicina", 87.5);
            Postulante postulante3 = new Postulante("Carlos", "Mendoza");

            // Actualización de valores usando set
            postulante1.setEdad(21);
            postulante1.setPromedioAcademico(90.0);

            // Mostrar información
            postulante1.mostrarDatos();
            postulante2.mostrarDatos();
            postulante3.mostrarDatos();
        }

}
