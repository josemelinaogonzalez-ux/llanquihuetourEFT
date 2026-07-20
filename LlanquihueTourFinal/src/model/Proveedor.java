package model;
import interfaces.Registrable;
public class Proveedor extends Persona implements Registrable {

    private String servicio;

    public Proveedor() {
    }

    public Proveedor(String rut, String nombre, String telefono, String correo, String servicio) {
        super(rut, nombre, telefono, correo);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", servicio='" + servicio + "'";
    }
    @Override
    public void registrar() {
        System.out.println("Proveedor registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }
}