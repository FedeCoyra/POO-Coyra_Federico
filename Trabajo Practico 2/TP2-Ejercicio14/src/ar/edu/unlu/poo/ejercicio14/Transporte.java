package ar.edu.unlu.poo.ejercicio14;

public class Transporte extends Proveedor {
    private double precioCatering;

    public Transporte(String nombre, double precioBase, double precioCatering) {
        super(nombre, precioBase, "Transporte");
        this.precioCatering = precioCatering;
    }

    public double calcularImporte(int numClientes) {
        return super.calcularImporte(numClientes) + (0.003 * precioCatering * numClientes);
    }
}