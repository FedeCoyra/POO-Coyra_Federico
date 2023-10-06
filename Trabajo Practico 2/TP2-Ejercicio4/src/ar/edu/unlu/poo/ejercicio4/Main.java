package ar.edu.unlu.poo.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente - Federico", 2000.0, 1000.0, 3000.0);

        cliente.realizarInversion(200.0, 20);
        cliente.realizarCompraCredito(10000.0);
        cliente.realizarCompraCredito(300.0);
        cliente.realizarPagoCredito(70.0);

        System.out.println("Saldo: " + cliente.getSaldo() + "\n");
        System.out.println("Límite de Giro en Descubierto: " + cliente.getLimiteGiroNormal()+ "\n");
        System.out.println("Monto disponible para compras en crédito: " + cliente.getMontoDisponibleCredito()+ "\n");
        System.out.println("Saldo deudor en crédito: " + cliente.getSaldoDeudorCredito()+ "\n");
        System.out.println("Monto invertido: " + cliente.getMontoInvertido()+ "\n");
        System.out.println("Interés de la inversión: " + cliente.getInteresInversion()+ "\n");
    }
}
