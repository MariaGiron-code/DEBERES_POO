package Practica4;
public class main_Ciclista {
    public static void main(String[] args) {
        Ciclista ciclista1 = new Ciclista("Maria Giron", 26, 4200);
        Ciclista ciclista2 = new Ciclista("Eduardo Ganchala", 21, 3800);
        Ciclista ciclista3 = new Ciclista("Rigoberto Urán", 37, 3500);

        ciclista1.mostrarInformacion();
        ciclista2.mostrarInformacion();
        ciclista3.mostrarInformacion();

        ciclista1.actualizarKilometros(300);
        System.out.println("Promedio mensual de " + ciclista1.nombre + ": " +
                ciclista1.calcularPromedioMensual() + " km/mes");
    }
}
