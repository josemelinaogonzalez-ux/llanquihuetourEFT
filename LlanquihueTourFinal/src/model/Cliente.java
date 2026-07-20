package model;
import interfaces.Registrable;
public class Cliente extends Persona implements Registrable {

    private String tipoCliente;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String rut, String nombre, String telefono, String correo, String tipoCliente) {
        super(rut, nombre, telefono, correo);
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipoCliente='" + tipoCliente + "'";
    }
    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }
}