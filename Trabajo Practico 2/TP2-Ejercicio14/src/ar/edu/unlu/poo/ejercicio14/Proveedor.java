package ar.edu.unlu.poo.ejercicio14;

public class Proveedor{
    private String nombre;
    private double precioBase;
    private String clasificacion;

    public Proveedor(String nombre, double precioBase, String clasificacion) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.clasificacion = clasificacion;
    }

    public double calcularImporte(int numClientes) {
        return precioBase;
    }
}