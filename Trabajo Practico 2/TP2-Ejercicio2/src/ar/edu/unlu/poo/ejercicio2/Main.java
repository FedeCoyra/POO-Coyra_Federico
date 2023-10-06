package ar.edu.unlu.poo.ejercicio2;

public class Main {

    public static void main(String[] argumentos) {

        SunBeach administrador = new SunBeach();

        Destino destino1 = new Destino("Pinamar");
        Destino destino2 = new Destino("Paris");
        Destino destino3 = new Destino("Marbella");

        administrador.agregarDestino(destino1);
        administrador.agregarDestino(destino2);
        administrador.agregarDestino(destino3);

        Hospedaje hospedaje1 = new Hospedaje("Impeke House");
        Hospedaje hospedaje2 = new Hospedaje("Le Ble");
        Hospedaje hospedaje3 = new Hospedaje("Marbella HyS");

        Transporte transporte1 = new Transporte("Taxi");
        Transporte transporte2 = new Transporte("Avion");
        Transporte transporte3 = new Transporte("Barco");

        Excursion excursion1 = new Excursion("Medanos de Pinamar");
        Excursion excursion2 = new Excursion("Visita a la Torre Eiffel");
        Excursion excursion3 = new Excursion("Vuelta el Yate por Marbella");

        Paquete paquete1 = new Paquete("Paquete Basico", "Opción menos costosa.", 500, destino1, transporte1, hospedaje1);
        paquete1.agregarExcursion(excursion1);

        Paquete paquete2 = new Paquete("Paquete Normal", "Opción media.", 2200, destino2, transporte2, hospedaje2);
        paquete2.agregarExcursion(excursion1);
        paquete2.agregarExcursion(excursion2);

        Paquete paquete3 = new Paquete("Paquete Premium", "Opción más costosa.", 4100, destino3, transporte3, hospedaje3);
        paquete2.agregarExcursion(excursion1);
        paquete2.agregarExcursion(excursion2);
        paquete2.agregarExcursion(excursion3);

        administrador.agregarPaquete(paquete1);
        administrador.agregarPaquete(paquete2);
        administrador.agregarPaquete(paquete3);

        Cliente cliente1 = new Cliente("Juan Castro", "22702601", "juanca@gmail.com");
        Cliente cliente2 = new Cliente("Pedro Perez", "25806907", "peterperez@hotmail.com");
        Cliente cliente3 = new Cliente("Agustina Marquez", "40423809", "agusm40@yahoo.com.ar");

        administrador.registrarCliente(cliente1);
        administrador.registrarCliente(cliente2);
        administrador.registrarCliente(cliente3);

        Proveedor proveedor1 = new Proveedor("Chevallier", "Terrestre");
        Proveedor proveedor2 = new Proveedor("Air France", "Aereo");
        Proveedor proveedor3 = new Proveedor("MI Navegacion", "Maritimo");

        administrador.contratarProveedor(proveedor1);
        administrador.contratarProveedor(proveedor2);
        administrador.contratarProveedor(proveedor3);

        Compra compra1 = new Compra(cliente1, paquete1);
        Compra compra2 = new Compra(cliente2, paquete1);
        Compra compra3 = new Compra(cliente3, paquete2);

        administrador.registrarVenta(compra1);
        administrador.registrarVenta(compra2);
        administrador.registrarVenta(compra3);

        System.out.println("Proveedores:");
        for (Proveedor proveedor : administrador.getProveedores()){
            System.out.printf("Proveedor de servicio: %s  -  Clasificacion de transporte: %s\n", proveedor.getNombre(), proveedor.getClasificacion());
        }

        System.out.println("\nPaquetes con disponibilidad:");
        int contador=0;
        for (Paquete paquete : administrador.getPaquetes()){
            contador++;
            System.out.printf("%d. '%s'  Precio del paquete: %f\n", contador, paquete.getNombre(), paquete.getValorDelPaquete());
        }

        System.out.println("\nClientes:");
        for (Cliente cliente : administrador.getClientes()){
            System.out.printf("- Nombre: %s,   DNI: %s,  Email: %s\n", cliente.getNombre(), cliente.getDni(), cliente.getEmail());
        }

        System.out.println("\nVentas (Destinos):");
        for (Destino destino : administrador.getDestinos()){
            int contadorVentas = 0;

            for (Compra venta : administrador.getVentas()){
                if (venta.getPaquete().getDestino().equals(destino)){
                    contadorVentas++;
                }
            }

            System.out.printf("%s: %d.\n", destino.getDestino(), contadorVentas);
        }

        Destino destinoFavorito= new Destino("");
        int maxVentas = 0;
        for (Destino destino : administrador.getDestinos()){
            int contadorVentas = 0;

            for (Compra venta : administrador.getVentas()){
                if (venta.getPaquete().getDestino().equals(destino)){
                    contadorVentas++;
                }
            }
            if (contadorVentas > maxVentas){
                maxVentas = contadorVentas;
                destinoFavorito = destino;
            }
        }

        System.out.printf("\nEl destino más comprado de los clientes es %s\n", destinoFavorito.getDestino());
    }
}
