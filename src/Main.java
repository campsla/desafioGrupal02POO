import Service.ServiceCliente;
import Service.ServiceRutina;

public class Main {
    public static void main(String[] args) {

/*        ServiceCliente sc = new ServiceCliente();
        sc.agregarCliente(sc.crearCliente());
        sc.agregarCliente(sc.crearCliente());
        sc.agregarCliente(sc.crearCliente());
        sc.imprimirCLientes();
        sc.modificarCliente(123);
        sc.eliminarCliente(456);
        sc.imprimirCLientes();*/

        ServiceRutina sr = new ServiceRutina();
        sr.agregarRutina(sr.crearRutina());
        sr.agregarRutina(sr.crearRutina());
        sr.agregarRutina(sr.crearRutina());
        sr.imprimirRutinas();
        sr.modificarRutina(123);
        sr.eliminarRutina(789);
        sr.imprimirRutinas();



    }
}