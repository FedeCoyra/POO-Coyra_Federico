package ar.edu.unlu.poo.ejercicio11;

public class Main {
    public static void main(String[] args) {
        SistemaAgencia sistemaAgencia = new SistemaAgencia();

        // Registrar vehículos
        Vehiculo auto1 = new AutoPasajero("ABC123", 2, 4);
        Vehiculo auto2 = new AutoVip("DEF456", 7);
        Vehiculo combi1 = new Combi("GHI789", 2);
        Vehiculo camionetaFlete1 = new CamionetaFlete("JKL012", 1, 1000);
        Vehiculo camionCarga1 = new CamionCarga("MNO345", 29 );

        sistemaAgencia.registrarVehiculo(auto1);
        sistemaAgencia.registrarVehiculo(auto2);
        sistemaAgencia.registrarVehiculo(combi1);
        sistemaAgencia.registrarVehiculo(camionetaFlete1);
        sistemaAgencia.registrarVehiculo(camionCarga1);

        // Registrar clientes
        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Victor");
        Cliente cliente4 = new Cliente("Claudio");
        Cliente cliente5 = new Cliente("Roman");

        Presupuesto presupuesto1 = sistemaAgencia.generarPresupuesto(auto1, 2);
        sistemaAgencia.registrarAlquiler(cliente1, presupuesto1);
        System.out.println(cliente1.getNombre() + " alquiló un Auto de Pasajero por " +
                presupuesto1.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente1.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente1) + "\n");

        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto2 = sistemaAgencia.generarPresupuesto(combi1, 2);
        sistemaAgencia.registrarAlquiler(cliente4, presupuesto2);
        System.out.println(cliente4.getNombre() + " alquiló una Combi " +
                presupuesto2.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente4.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente4) + "\n");

        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto3 = sistemaAgencia.generarPresupuesto(camionCarga1, 29);
        sistemaAgencia.registrarAlquiler(cliente2, presupuesto3);
        System.out.println(cliente2.getNombre() + " alquiló un Camión de Carga por " + presupuesto3.getDiasAlquiler() + " días.");

        System.out.println("Monto total de alquileres para " + cliente2.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente2) + "\n");
        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto4 = sistemaAgencia.generarPresupuesto(auto2, 7);
        sistemaAgencia.registrarAlquiler(cliente3, presupuesto4);
        System.out.println(cliente3.getNombre() + " alquiló un Auto VIP por " + presupuesto4.getDiasAlquiler() + " dias.");

        System.out.println("Monto total de alquileres para " + cliente3.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente3) + "\n");

        //--------------------------------------------------------------------------------------

        Presupuesto presupuesto5 = sistemaAgencia.generarPresupuesto(camionetaFlete1, 1);
        sistemaAgencia.registrarAlquiler(cliente5, presupuesto5);
        System.out.println(cliente5.getNombre() + " alquiló un Camioneta tipo Flete por " + presupuesto5.getDiasAlquiler() + " dias.");

        System.out.println("Monto total de alquileres para " + cliente5.getNombre() + ": $" +
                sistemaAgencia.obtenerMontoTotalAlquileresCliente(cliente5) + "\n");

        //--------------------------------------------------------------------------------------

        sistemaAgencia.registrarCliente(cliente1);
        sistemaAgencia.registrarCliente(cliente2);
        sistemaAgencia.registrarCliente(cliente3);
        sistemaAgencia.registrarCliente(cliente4);
        sistemaAgencia.registrarCliente(cliente5);


        System.out.println("Monto total de alquileres en el sistema: $" +
                sistemaAgencia.obtenerMontoTotalAlquileresSistema());
    }
}
