package ar.edu.unlu.poo.ejercicio4;

public class Cliente {
    private String nombre;
    private Normal normal;
    private Credito credito;

    public Cliente(String nombre, double saldoInicial, double limiteGiroNormal, double limiteGastoCredito) {
        this.nombre = nombre;
        this.normal = new Normal(saldoInicial, limiteGiroNormal);
        this.credito = new Credito(limiteGastoCredito);
    }

    public void realizarCompraCredito(double monto) {
        double montoDisponibleCredito = credito.getLimiteGasto() - credito.getDeudaAcumulada();

        if (monto <= montoDisponibleCredito) {
            credito.realizarCompra(monto);
        } else {
            System.out.println("\nGasto de " + monto + " excede los limites establecidos de la Cuenta Credito.\n");
        }
    }
    public void realizarPagoCredito(double monto) {
        credito.realizarPago(monto);
    }
    public void realizarInversion(double monto, int dias) {
        normal.realizarInversion(monto, dias);
    }
    public double getSaldo() {
        return normal.getSaldo();
    }
    public double getLimiteGiroNormal() {
        return normal.getLimiteGiroEnDescubierto();
    }
    public double getMontoDisponibleCredito() {
        return credito.getLimiteGasto() - credito.getDeudaAcumulada();

    }
    public double getSaldoDeudorCredito() {
        return credito.getDeudaAcumulada();
    }
    public double getMontoInvertido() {
        return normal.getMontoInvertido();
    }
    public double getInteresInversion() {
        return normal.calcularInteresInversion();
    }
}
