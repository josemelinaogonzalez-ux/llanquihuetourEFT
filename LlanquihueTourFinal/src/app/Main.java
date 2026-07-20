package app;

import model.*;
import utils.ArchivoUtil;
import exceptions.RutInvalidoException;
import utils.ValidadorRut;
import interfaces.Registrable;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        SistemaTurismo sistema = new SistemaTurismo();

        Guia guia = new Guia(
                "19.623.648-1",
                "Jose Melinao Gonzalez",
                "987654321",
                "jose.melinao@gmail.com",
                "Senderismo"
        );

        Cliente cliente = new Cliente(
                "21.282.260-4",
                "Magdalena Mollo Sandoval",
                "912345678",
                "magdalena.mollo@gmail.com",
                "Frecuente"
        );

        Proveedor proveedor = new Proveedor(
                "22222222-2",
                "Carlos Rojas",
                "923456789",
                "carlos@hotel.cl",
                "Hotel"
        );

        Tour tour = new Tour(
                1,
                "Volcán Osorno",
                "Puerto Varas",
                35000,
                guia
        );

        Reserva reserva = new Reserva(
                1,
                cliente,
                tour,
                2,
                "20/07/2026"
        );

        sistema.agregarGuia(guia);
        sistema.agregarCliente(cliente);
        sistema.agregarProveedor(proveedor);
        sistema.agregarTour(tour);
        sistema.agregarReserva(reserva);
        List<Registrable> registrables = new ArrayList<>();

        registrables.add(cliente);
        registrables.add(guia);
        registrables.add(proveedor);
        System.out.println("\n===== LISTA POLIMÓRFICA =====");

        for (Registrable registrable : registrables) {
            registrable.mostrarDatos();
        }
        System.out.println("\n===== VALIDACIÓN DE TIPOS =====");

        for (Registrable registrable : registrables) {

            if (registrable instanceof Cliente) {
                System.out.println("El objeto corresponde a un Cliente.");
            } else if (registrable instanceof Guia) {
                System.out.println("El objeto corresponde a un Guía.");
            } else if (registrable instanceof Proveedor) {
                System.out.println("El objeto corresponde a un Proveedor.");
            }

        }
        ArchivoUtil.guardar("src/data/guias.txt", guia.toString());
       // ArchivoUtil.guardar("src/data/clientes.txt", cliente.toString());
        ArchivoUtil.guardar("src/data/proveedores.txt", proveedor.toString());
        ArchivoUtil.guardar("src/data/tours.txt", tour.toString());
        ArchivoUtil.guardar("src/data/reservas.txt", reserva.toString());

        System.out.println("===== CLIENTES =====");
        cliente.mostrarDatos();

        System.out.println("\n===== GUÍAS =====");
        guia.mostrarDatos();

        System.out.println("\n===== PROVEEDORES =====");
        proveedor.mostrarDatos();

        System.out.println("\n===== TOURS =====");
        System.out.println(tour);

        System.out.println("\n===== RESERVAS =====");
        System.out.println(reserva);
        System.out.println("\n===== PRUEBA DE COLECCIONES =====");
        sistema.mostrarClientes();

        System.out.println("\n===== BÚSQUEDA POR RUT =====");

        Cliente clienteEncontrado =
                sistema.buscarClientePorRut("21.282.260-4");

        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println(clienteEncontrado);
        } else {
            System.out.println("Cliente no encontrado.");
            System.out.println("\n===== VALIDACIÓN DE RUT =====");

            try {
                ValidadorRut.validar(cliente.getRut());
                System.out.println("RUT válido: " + cliente.getRut());
            } catch (RutInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("\n===== CLIENTES LEÍDOS DESDE ARCHIVO =====");

                ArrayList<Cliente> clientesArchivo =
                        ArchivoUtil.leerClientes("src/data/clientes.txt");

                for (Cliente clienteArchivo : clientesArchivo) {
                    System.out.println(clienteArchivo);
                    System.out.println("\n===== FILTRO DE TOURS =====");
                    sistema.filtrarToursPorDestino("Puerto Varas");
                }
            }
        }
        System.out.println("\n===== FILTRO DE TOURS =====");
        sistema.filtrarToursPorDestino("Puerto Varas");
    }

}