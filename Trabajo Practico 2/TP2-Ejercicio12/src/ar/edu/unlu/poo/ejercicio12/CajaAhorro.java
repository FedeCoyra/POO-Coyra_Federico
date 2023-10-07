package ar.edu.unlu.poo.ejercicio12;

public class CajaAhorro extends Cuenta {
    private double tasaInteres;

    public CajaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void realizarDeposito(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto total del depósito debe ser mayor a 0.");
        }
    }

}
