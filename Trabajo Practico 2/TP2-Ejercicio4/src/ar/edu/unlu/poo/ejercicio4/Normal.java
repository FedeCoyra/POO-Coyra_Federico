package ar.edu.unlu.poo.ejercicio4;

public class Normal {
    private double saldo;
    private double limiteGiroEnDescubierto;
    private Inversion inversion;

    public Normal(double saldo, double limiteGiroEnDescubierto) {
        this.saldo = saldo;
        this.limiteGiroEnDescubierto = limiteGiroEnDescubierto;
        this.inversion = null;
    }

    public void realizarInversion(double monto, int dias) {
        if (inversion == null) {
            inversion = new Inversion(monto, dias);
        } else {
            System.out.println("Ya tienes una inversión en curso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteGiroEnDescubierto() {
        return limiteGiroEnDescubierto;
    }

    public double getMontoDisponible() {
        double montoDisponible = saldo + limiteGiroEnDescubierto;
        if (inversion != null) {
            montoDisponible += inversion.calcularInteres();
        }
        return montoDisponible;
    }

    public double getMontoInvertido() {
        if (inversion != null) {
            return inversion.getMontoInvertido();
        }
        return 0;
    }

    public double calcularInteresInversion() {
        if (inversion != null) {
            return inversion.calcularInteres();
        }
        return 0;
    }
}
