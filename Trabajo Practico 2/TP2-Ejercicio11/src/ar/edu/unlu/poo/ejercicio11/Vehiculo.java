package ar.edu.unlu.poo.ejercicio11;

public class Vehiculo {
    protected String patente;
    protected int diasAlquiler;

    public Vehiculo(String patente, int diasAlquiler) {
        this.patente = patente;
        this.diasAlquiler = diasAlquiler;
    }

    public double calcularCostoAlquiler() {
        return 3000 * diasAlquiler; // Precio base por día
    }

    public String getPatente() {
        return patente;
    }
}