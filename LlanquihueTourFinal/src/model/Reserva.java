package model;

public class Reserva {

    private int idReserva;
    private Cliente cliente;
    private Tour tour;
    private int cantidadPersonas;
    private String fecha;

    public Reserva() {
    }

    public Reserva(int idReserva, Cliente cliente, Tour tour,
                   int cantidadPersonas, String fecha) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.tour = tour;
        this.cantidadPersonas = cantidadPersonas;
        this.fecha = fecha;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double calcularTotal() {
        return tour.getPrecio() * cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", cliente=" + cliente.getNombre() +
                ", tour=" + tour.getNombre() +
                ", cantidadPersonas=" + cantidadPersonas +
                ", fecha='" + fecha + '\'' +
                ", total=" + calcularTotal() +
                '}';
    }
}