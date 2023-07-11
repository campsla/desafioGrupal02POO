package Service;

import Entity.Cliente;
import Entity.Rutina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceRutina {
    private Scanner read;
    private List<Rutina> listaRutina;

    public ServiceRutina() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.listaRutina = new ArrayList();
    }

    public Rutina crearRutina() {
        System.out.println("Ingrese por favor el ID ");
        int id = read.nextInt();
        System.out.println("Ingrese por favor el Nombre ");
        String nombre = read.next();
        System.out.println("Ingrese por favor el Duracion ");
        int duracion = read.nextInt();
        System.out.println("Ingrese por favor el Nivel de Dificultad ");
        int nivDIficultad = read.nextInt();
        System.out.println("Ingrese por favor el Descripcion ");
        String descripcion = read.next();

        return new Rutina(id,nombre,duracion,nivDIficultad,descripcion);
    }

    public void agregarRutina(Rutina rutina) {
        listaRutina.add(rutina);
    }

    public void imprimirRutinas() {
        System.out.println(" ");
        System.out.println("--------------Lista de Rutinas---------------");

        for (Rutina varAuxRutina : listaRutina) {
            System.out.println(varAuxRutina.toString());
        }
        System.out.println(listaRutina.size());
    }

    public void modificarRutina(int idModificar) {
        System.out.println(" ");
        System.out.println("--------------Modificar Un Rutina---------------");
        for (Rutina AuxRutina : listaRutina) {
            if (AuxRutina.getId() == idModificar) {
                System.out.print("Ingrese el nuevo nombre: ");
                AuxRutina.setNombre(read.next());
                System.out.print("Ingrese el nuevo nivel de dificultad: ");
                AuxRutina.setNivDificultad(read.nextInt());
                break;
            }
        }
    }

    public void eliminarRutina(int idEliminar){
        for (Rutina AuxRutina : listaRutina) {
            if (AuxRutina.getId() == idEliminar) {
                listaRutina.remove(AuxRutina);
                break;
            }
        }
    }

}
