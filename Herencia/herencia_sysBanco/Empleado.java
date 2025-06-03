package Herencia.herencia_sysBanco;

class Empleado extends Persona {
    private String usuario;
    private String clave;

    public Empleado(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono);
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean autenticarEmpleado(String usuario, String clave) {
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    public void crearCuentaParaCliente(Cliente cliente, String tipo) {
        cliente.registrarCuenta(tipo);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy un empleado bancario.");
    }
}