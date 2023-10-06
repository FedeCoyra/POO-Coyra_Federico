package ar.edu.unlu.poo.ejercicio14;

public class Guia extends Proveedor {
    private int cantidadMaxima;
    public Guia(String nombre, double precioBase, int cantidadMaxima) {
        super(nombre, precioBase, "Guía Turístico");
        this.cantidadMaxima = cantidadMaxima;
    }
    public double calcularImporte(int numClientes) {
        if (numClientes > 200) {
            return super.calcularImporte(numClientes) + 90.0;
        } else {
            return super.calcularImporte(numClientes);
        }
    }
}
