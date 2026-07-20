package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import model.Cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class ArchivoUtil {

    public static void guardar(String archivo, String texto) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {

            bw.write(texto);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }

    }
    public static ArrayList<Cliente> leerClientes(String archivo) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (!linea.trim().isEmpty()) {

                    String[] datos = linea.split(";");

                    if (datos.length == 5) {

                        Cliente cliente = new Cliente(
                                datos[0],
                                datos[1],
                                datos[2],
                                datos[3],
                                datos[4]
                        );

                        clientes.add(cliente);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer clientes: " + e.getMessage());
        }

        return clientes;
    }
}