package Service;

import Entity.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceCliente {
    private Scanner read;
    private List<Cliente> listaClientes;

    public ServiceCliente() {
        this.read = new Scanner(System.in);
        this.listaClientes = new ArrayList();
    }

    public Cliente crearCliente() {
        System.out.println("Ingrese por favor el ID ");
        int id = read.nextInt();
        System.out.println("Ingrese por favor el Nombre ");
        String nombre = read.next();
        System.out.println("Ingrese por favor el Edad ");
        int edad = read.nextInt();
        System.out.println("Ingrese por favor el Altura ");
        double altura = read.nextDouble();
        System.out.println("Ingrese por favor el Peso ");
        double peso = read.nextDouble();
        System.out.println("Ingrese por favor el Objetivo ");
        String objetivo = read.next();

        return new Cliente(id, nombre, edad, altura, peso, objetivo);
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void imprimirCLientes() {
        System.out.println(" ");
        System.out.println("--------------Lista de CLientes---------------");
        for (Cliente varAuxCliente : listaClientes) {
            System.out.println(varAuxCliente.toString());
        }
        System.out.println(listaClientes.size());
    }

    public void modificarCliente(int idModificar) {
        System.out.println(" ");
        System.out.println("--------------Modificar Un Cliente---------------");


        for (Cliente AuxCliente : listaClientes) {

            if (AuxCliente.getId() == idModificar) {
                System.out.print("Ingrese el nuevo nombre: ");
                AuxCliente.setNombre(read.next());
                System.out.print("Ingrese la nueva edad: ");
                AuxCliente.setEdad(read.nextInt());
                break;
            }
        }

    }

    public void eliminarCliente(int idEliminar) {
        for (Cliente AuxCliente : listaClientes) {
            if (AuxCliente.getId() == idEliminar) {
                listaClientes.remove(AuxCliente);
                break;
            }
        }
    }
}
