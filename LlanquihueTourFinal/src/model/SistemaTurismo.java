package model;

import java.util.ArrayList;

public class SistemaTurismo {

    private ArrayList<Cliente> clientes;
    private ArrayList<Guia> guias;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Tour> tours;
    private ArrayList<Reserva> reservas;

    public SistemaTurismo() {
        clientes = new ArrayList<>();
        guias = new ArrayList<>();
        proveedores = new ArrayList<>();
        tours = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarGuia(Guia guia) {
        guias.add(guia);
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void agregarTour(Tour tour) {
        tours.add(tour);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Guia> getGuias() {
        return guias;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void mostrarClientes() {
        System.out.println("===== LISTA DE CLIENTES =====");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public Cliente buscarClientePorRut(String rut) {

        for (Cliente cliente : clientes) {
            if (cliente.getRut().equalsIgnoreCase(rut)) {
                return cliente;
            }
        }

        return null;
    }

    public void filtrarToursPorDestino(String destino) {

        System.out.println("===== TOURS FILTRADOS POR DESTINO =====");

        boolean encontrado = false;

        for (Tour tour : tours) {
            if (tour.getDestino().equalsIgnoreCase(destino)) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours para ese destino.");
        }
    }
}