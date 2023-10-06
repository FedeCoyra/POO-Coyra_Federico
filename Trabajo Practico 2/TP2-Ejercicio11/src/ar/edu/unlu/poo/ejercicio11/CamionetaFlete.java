package ar.edu.unlu.poo.ejercicio11;

class CamionetaFlete extends Vehiculo {
    private int pesoAutorizadoTotal;

    public CamionetaFlete(String patente, int diasAlquiler, int pesoAutorizadoTotal) {
        super(patente, diasAlquiler);
        this.pesoAutorizadoTotal = pesoAutorizadoTotal;
    }

    @Override
    public double calcularCostoAlquiler() {
        return super.calcularCostoAlquiler() + 600 * pesoAutorizadoTotal;
    }
}