package model;
import interfaces.Registrable;
public class Guia extends Persona implements Registrable {

    private String especialidad;

    public Guia() {
    }

    public Guia(String rut, String nombre, String telefono, String correo, String especialidad) {
        super(rut, nombre, telefono, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", especialidad='" + especialidad + "'";
    }
    @Override
    public void registrar() {
        System.out.println("Guía registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }
}