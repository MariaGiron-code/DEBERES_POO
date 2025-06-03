package Herencia.herencia_sysBanco;

class Cliente extends Persona {
    public Cliente(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
    }

    public boolean ingresarAlSistema() {
        return true;
    }

    public void registrarCuenta(String tipo) {
        System.out.println("Cuenta " + tipo + " registrada.");
    }

    public void solicitarPrestamo(double monto) {
        System.out.println("Solicitando préstamo de $" + monto);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy un cliente bancario.");
    }
}
