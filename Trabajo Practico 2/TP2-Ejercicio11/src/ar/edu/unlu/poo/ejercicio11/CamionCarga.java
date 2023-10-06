package ar.edu.unlu.poo.ejercicio11;

class CamionCarga extends Vehiculo {
    public CamionCarga(String patente, int diasAlquiler) {
        super(patente, diasAlquiler);
    }

    @Override
    public double calcularCostoAlquiler() {
        if (diasAlquiler > 30) {
            return 75000 * diasAlquiler; //Mas de 30 dias
        } else {
            return 100000 * diasAlquiler; //Menor o igual a 30 dias
        }
    }
}