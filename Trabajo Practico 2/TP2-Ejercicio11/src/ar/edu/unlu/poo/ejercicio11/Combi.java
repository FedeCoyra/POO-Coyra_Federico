package ar.edu.unlu.poo.ejercicio11;

public class Combi extends Vehiculo {
    public Combi(String patente, int diasAlquiler) {
        super(patente, diasAlquiler);
    }

    @Override
    public double calcularCostoAlquiler() {
        return super.calcularCostoAlquiler() + 1500 * diasAlquiler;
    }
}

