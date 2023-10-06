package ar.edu.unlu.poo.ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SunBeach {

    private List<Proveedor> proveedores = new ArrayList<>();
    private List<Paquete> paquetes = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<String> informeVentas = new ArrayList<>();

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void registrarVenta(Cliente cliente, Paquete paquete) {
        cliente.comprarPaquete(paquete);

        informeVentas.add("Cliente: " + cliente.getNombre() + ", Paquete de destino " + paquete.getDestino().getNombre());
    }

    public Destino calcularDestinoFavorito() {
        Map<Destino, Integer> destinosVentas = new HashMap<>();

        for (Paquete paquete : paquetes) {
            Destino destino = paquete.getDestino();
            int ventas = destinosVentas.getOrDefault(destino, 0);
            destinosVentas.put(destino, ventas + 1);
        }

        Destino destinoFavorito = null;
        int maxVentas = 0;

        for (Map.Entry<Destino, Integer> entry : destinosVentas.entrySet()) {
            Destino destino = entry.getKey();
            int ventas = entry.getValue();
            if (ventas > maxVentas) {
                maxVentas = ventas;
                destinoFavorito = destino;
            }
        }
        return destinoFavorito;
    }

    public void generarInformeVentasPorDestino() {
        Map<Destino, List<Paquete>> ventasPorDestino = new HashMap<>();

        for (Paquete paquete : paquetes){
            Destino destino = paquete.getDestino();
            List<Paquete> ventas = ventasPorDestino.getOrDefault(destino, new ArrayList<>());
            ventas.add(paquete);
            ventasPorDestino.put(destino, ventas);
        }

        System.out.println("Informe de ventas organizadas por destino:\n");

        for (Map.Entry<Destino, List<Paquete>> entry : ventasPorDestino.entrySet()) {
            Destino destino = entry.getKey();
            List<Paquete> ventas = entry.getValue();

            System.out.println("Destino: " + destino.getNombre());
            for (Paquete paquete : ventas) {
                for (Cliente cliente : clientes) {
                    if (cliente.getCompras().contains(paquete)) {
                        double precioPorPersona = paquete.calcularPrecioPorPersona(cliente.getCompras().size());
                        System.out.println("Cliente: " + cliente.getNombre() + ", Precio por persona: $" + precioPorPersona);
                    }
                }
            }
            System.out.println();
        }
    }
    public List<String> getInformeVentas() {
        return informeVentas;
    }
}
