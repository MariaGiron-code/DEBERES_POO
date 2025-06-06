package util;
class Validaciones {

    // Método para validar si una cadena es nula o vacía
    public static boolean esNuloOVacio(String cadena) {
        return cadena == null || cadena.trim().isEmpty();
    }

    // Método para validar si un número está dentro de un rango específico
    public static boolean estaEnRango(int numero, int min, int max) {
        return numero >= min && numero <= max;
    }

    // Metodo para validar si una cedula tiene el formato correcto (ejemplo simplificado)
    public static boolean esCedulaValida(String cedula) {
        return cedula != null && cedula.matches("\\d{10}");
    }
}