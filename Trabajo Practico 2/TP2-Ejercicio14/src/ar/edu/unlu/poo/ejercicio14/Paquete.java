package ar.edu.unlu.poo.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private Destino destino;
    private List<Proveedor> proveedores = new ArrayList<>();

    public Paquete(Destino destino) {
        this.destino = destino;
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public double calcularPrecioPorPersona(int numClientes) {
        double precioTotal = 0.0;
        for (Proveedor proveedor : proveedores) {
            precioTotal += proveedor.calcularImporte(numClientes);
        }
        return precioTotal / numClientes;
    }

    public Destino getDestino() {
        return destino;
    }
}