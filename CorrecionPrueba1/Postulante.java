package CorrecionPrueba1;
public class Postulante {
        // Atributos privados
        private String nombre;
        private String apellido;
        private int edad;
        private String telefono;
        private String correo;
        private String nacionalidad;
        private String condicionSocioeconomica;
        private String carrera;
        private double promedioAcademico;
    //definir getters y setters de los atributos


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setCondicionSocioeconomica(String condicionSocioeconomica) {
        this.condicionSocioeconomica = condicionSocioeconomica;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    // Constructor 1: Solo nombre y apellido
        public Postulante(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = 18; // Asume edad mínima
            this.promedioAcademico = 89; // Sin definir aún
        }

        // Constructor 2: Nombre, apellido y carrera (con valores predeterminados)
        public Postulante(String nombre, String apellido, String carrera) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.carrera = carrera;
            this.edad = 18; // Valor predeterminado
            this.promedioAcademico = 78.0; // Valor quemado
        }

        // Constructor 3: Todos los datos personales
        public Postulante(String nombre, String apellido, int edad, String telefono, String correo, String nacionalidad,
                          String condicionSocioeconomica, String carrera, double promedioAcademico) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.telefono = telefono;
            this.correo = correo;
            this.nacionalidad = nacionalidad;
            this.condicionSocioeconomica = condicionSocioeconomica;
            this.carrera = carrera;
            this.promedioAcademico = promedioAcademico;
        }

        // Métodos get y set
        public String getNombre() { return nombre; }
        public String getApellido() { return apellido; }
        public int getEdad() { return edad; }
        public double getPromedioAcademico() { return promedioAcademico; }
        public String getTelefono() { return telefono; }
        public String getCondicionSocioeconomica() { return condicionSocioeconomica; }

        public void setEdad(int edad) { this.edad = edad; }
        public void setPromedioAcademico(double promedio) { this.promedioAcademico = promedio; }

        // Método para validar si cumple requisitos de beca
        public boolean cumpleRequisitos() {
            return (condicionSocioeconomica != null && condicionSocioeconomica.equalsIgnoreCase("Baja")) &&
                    (edad >= 18) && (promedioAcademico >= 85.0);
        }

        // Método para mostrar datos si califica a la beca
        public void mostrarDatos() {
            if (cumpleRequisitos()) {
                System.out.println("\n----- Postulante Apto -----");
                System.out.println("Nombre: " + nombre + " " + apellido);
                System.out.println("Edad: " + edad);
                System.out.println("Carrera: " + carrera);
                System.out.println("Promedio: " + promedioAcademico);
                System.out.println("Nacionalidad: " + nacionalidad);
                System.out.println("Condición socioeconómica: " + condicionSocioeconomica);
            } else {
                System.out.println("\n----- Postulante No Apto -----");
                System.out.println("El postulante no cumple los requisitos para aplicar a la beca.");
            }
        }
    }

