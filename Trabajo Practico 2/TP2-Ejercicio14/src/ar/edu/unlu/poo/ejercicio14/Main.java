package ar.edu.unlu.poo.ejercicio14;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SunBeach agencia = new SunBeach();

        Transporte proveedorTransporte = new Transporte("Micro", 200.0, 50.0);
        Hospedaje proveedorHospedaje = new Hospedaje("Hoteles del Mar", 400.0, 30);
        Guia proveedorGuia = new Guia("Guía Roman", 50.0, 300);
        agencia.agregarProveedor(proveedorTransporte);
        agencia.agregarProveedor(proveedorHospedaje);
        agencia.agregarProveedor(proveedorGuia);

        Destino destino1 = new Destino("Pinamar");
        Destino destino2 = new Destino("Valeria del Mar");
        Paquete paquete1 = new Paquete(destino1);
        Paquete paquete2 = new Paquete(destino2);
        Paquete paquete3 = new Paquete(destino2);

        paquete1.agregarProveedor(proveedorTransporte);
        paquete1.agregarProveedor(proveedorHospedaje);
        paquete1.agregarProveedor(proveedorGuia);
        paquete2.agregarProveedor(proveedorTransporte);
        paquete2.agregarProveedor(proveedorGuia);
        paquete3.agregarProveedor(proveedorTransporte);
        paquete3.agregarProveedor(proveedorHospedaje);
        paquete3.agregarProveedor(proveedorGuia);

        agencia.agregarPaquete(paquete1);
        agencia.agregarPaquete(paquete2);
        agencia.agregarPaquete(paquete3);

        Cliente cliente1 = new Cliente("Silvina");
        Cliente cliente2 = new Cliente("Carlos");
        Cliente cliente3 = new Cliente("Andrea");

        agencia.registrarVenta(cliente1, paquete1);
        agencia.registrarVenta(cliente2, paquete2);
        agencia.registrarVenta(cliente3, paquete3);

        System.out.println();
        agencia.generarInformeVentasPorDestino();

        Destino destinoFavorito = agencia.calcularDestinoFavorito();
        if (destinoFavorito != null){
            System.out.println("El destino mas elegido por los clientes es: " + destinoFavorito.getNombre());
        }
        else{
            System.out.println("No se ha determinado un destino preferido todavia.");
        }

        List<String> informeVentas = agencia.getInformeVentas();
        System.out.println("\nInforme de ventas:");
        for (String venta : informeVentas) {
            System.out.println(venta);
        }
    }
}
