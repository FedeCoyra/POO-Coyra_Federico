package ar.edu.unlu.poo.ejercicio12;
import java.time.LocalDate;
public class Normal extends Cuenta {
    private double limiteGiroEnDescubierto;
    private LocalDate fechaInversion;
    private Inversion inversion;

    public Normal(double saldoInicial, double limiteGiroEnDescubierto) {
        super(saldoInicial);
        this.limiteGiroEnDescubierto = limiteGiroEnDescubierto;
        this.fechaInversion = null;
        this.inversion = null;
    }

    public void preCancelarInversion() {
        if (inversion != null && inversion.getMontoInvertido() > 0) {
            inversion.cancelarInversion();
        }
    }

    public void realizarInversion(double monto, int dias) {
        if (inversion == null || inversion.getMontoInvertido() == 0) {
            fechaInversion = LocalDate.now();
            inversion = new Inversion(monto, dias);
        } else {
            System.out.println("Ya tienes una inversión en curso.");
        }
    }

    public double getLimiteGiroEnDescubierto() {
        return limiteGiroEnDescubierto;
    }

    public double getMontoDisponible() {
        double montoDisponible = saldo + limiteGiroEnDescubierto;
        if (inversion != null) {
            double interes = inversion.calcularInteres();
            montoDisponible += interes;

            if (interes > 0 && !inversion.estaCancelada()) {
                return montoDisponible;
            }
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
