package ar.edu.unlu.poo.ejercicio6;

public class Main {
    public static void main(String[] argumentos){

        Informes administrador = new Informes();

        Cliente cliente1 = new Cliente("ABC 123", "Juan Castro");
        Cliente cliente2 = new Cliente("CDE 234", "Pedro Gonzalez");
        Cliente cliente3 = new Cliente("EFG 656", "Pablo Fernandez");
        Cliente cliente4 = new Cliente("GHI 432", "Paulo Diaz");
        Cliente cliente5 = new Cliente("IJK 567", "Leandro Pisculichi");
        Cliente cliente6 = new Cliente("YUI 789", "Martin Perez");
        Cliente cliente7 = new Cliente("POI 987", "Ernesto Alcoba");
        Cliente cliente8 = new Cliente("PAI 654", "Mirta Sanchez");
        Cliente cliente9 = new Cliente("GJA 311", "Fabiola Mujaj");
        Cliente cliente10 = new Cliente("HNS 453", "Sandra Lombardo");

        Empleado empleado = new Empleado("Cristian Medina", "22123543", "11-2500-4221");
        Empleado empleado2 = new Empleado("Mauro Lombardo", "25423702", "11-1232-0432");
        administrador.contratarEmpleado(empleado2);
        administrador.contratarEmpleado(empleado);

        Combustible nafta = new Combustible("Nafta");
        Combustible gasoil = new Combustible("Gasoil");
        Combustible kerosene = new Combustible("Kerosene");

        administrador.agregarCombustible(nafta);
        administrador.agregarCombustible(gasoil);
        administrador.agregarCombustible(kerosene);

        Surtidor surtidor1 = new Surtidor("1");
        Surtidor surtidor2 = new Surtidor("2");
        Surtidor surtidor3 = new Surtidor("3");


        Venta venta1 = new Venta(cliente1, nafta, 3, surtidor1);
        Venta venta2 = new Venta(cliente2, gasoil, 2, surtidor2);
        Venta venta3 = new Venta(cliente3, gasoil, 1, surtidor3);
        Venta venta4 = new Venta(cliente4, nafta, 4, surtidor1);
        Venta venta5 = new Venta(cliente5, nafta, 9, surtidor2);
        Venta venta6 = new Venta(cliente6, gasoil, 10, surtidor3);
        Venta venta7 = new Venta(cliente7, nafta, 7, surtidor1);
        Venta venta8 = new Venta(cliente8, gasoil, 8, surtidor2);
        Venta venta9 = new Venta(cliente9, gasoil, 5, surtidor3);
        Venta venta10 = new Venta(cliente10, kerosene, 6, surtidor3);

        empleado.registrarVenta(venta1);
        empleado.registrarVenta(venta2);
        empleado.registrarVenta(venta3);
        empleado.registrarVenta(venta4);
        empleado.registrarVenta(venta5);
        empleado2.registrarVenta(venta6);
        empleado2.registrarVenta(venta7);
        empleado2.registrarVenta(venta8);
        empleado2.registrarVenta(venta9);
        empleado2.registrarVenta(venta10);

        System.out.println("\nVentas de combustible:");
        administrador.ventasPorCombustible();

        System.out.println("\nVentas por surtidor:");
        administrador.generarInformeSurtidoresPorMonto();

        System.out.println("\nSurtidores (medidos en litros):");
        administrador.generarInformeSurtidoresPorLitros();

        System.out.println("\nEmpleados (orden de ventas):");
        administrador.generarInformeEmpleadosPorVentas();

        System.out.println("\nTOP 10 clientes: \n");
        administrador.generarTop10Clientes();


    }
}
