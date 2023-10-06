package ar.edu.unlu.poo.ejercicio4;

public class Inversion {
    private double montoInvertido;
    private int diasRestantes;

    public Inversion(double montoInvertido, int diasRestantes) {
        this.montoInvertido = montoInvertido;
        this.diasRestantes = diasRestantes;
    }

    public double calcularInteres() {
        if (diasRestantes > 0) {
            double interes = montoInvertido * 0.40;
            diasRestantes--;
            return interes;
        }
        return 0;
    }

    public double getMontoInvertido() {
        return montoInvertido;
    }
}