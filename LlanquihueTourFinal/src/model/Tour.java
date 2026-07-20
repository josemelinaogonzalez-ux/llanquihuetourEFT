package model;

public class Tour {

    private int id;
    private String nombre;
    private String destino;
    private double precio;
    private Guia guia;

    public Tour() {
    }

    public Tour(int id, String nombre, String destino, double precio, Guia guia) {
        this.id = id;
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.guia = guia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", guia=" + guia +
                '}';
    }
}