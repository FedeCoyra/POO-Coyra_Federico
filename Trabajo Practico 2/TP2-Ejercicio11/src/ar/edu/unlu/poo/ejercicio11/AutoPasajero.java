package ar.edu.unlu.poo.ejercicio11;

public class AutoPasajero extends Vehiculo {
    private int asientos;

    public AutoPasajero(String patente, int diasAlquiler, int asientos) {
        super(patente, diasAlquiler);
        this.asientos = asientos;
    }

    @Override
    public double calcularCostoAlquiler() {
        return super.calcularCostoAlquiler() + (300 * asientos * diasAlquiler); // $300 por asiento por día
    }
}
