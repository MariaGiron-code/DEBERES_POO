package Modelo;

public class CursoCertificado extends CursoRegular {
    private boolean entregaCertificado;

    public CursoCertificado(String nombre, int duracionSemanas, double precio, Docente docente, boolean entregaCertificado) {
        super(nombre, duracionSemanas, precio,docente);
        this.entregaCertificado = true;
    }

    public double calcularPrecioFinal() {
        return getPrecio() * 1.25; // 25% de recargo
    }
// Sobre escritura del metodo mostrarResumen para incluir el certificado
    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Tipo: Curso Certificado");
        System.out.println("Precio final con recargo: $" + calcularPrecioFinal());
        System.out.println("Incluye certificado: " + (entregaCertificado ? "Sí" : "No"));
    }
}