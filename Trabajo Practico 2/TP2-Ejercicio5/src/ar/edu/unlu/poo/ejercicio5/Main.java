package ar.edu.unlu.poo.ejercicio5;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gonzalo Martinez", 2000.0, 500.0, 1200.0);

        System.out.println("Saldo Inicial: " + cliente.getSaldo());
        System.out.println("Límite de Giro en Descubierto: " + cliente.getLimiteGiroNormal());
        System.out.println("Límite de Gasto en Crédito: " + cliente.getMontoDisponibleCredito());
        System.out.println("Saldo Deudor en Crédito: " + cliente.getSaldoDeudorCredito());
        System.out.println(" ");

        double montoInversion = 600.0;
        int diasInversion = 32;
        cliente.realizarInversion(montoInversion, diasInversion);
        System.out.println("Se ha realizado una inversión de " + montoInversion + " con un plazo de " + diasInversion + " días.");
        System.out.println("Monto invertido: " + cliente.getMontoInvertido());
        System.out.println("Interés en la inversión: " + cliente.getInteresInversion());
        System.out.println(" ");

        double compra1 = 700.0;
        double compra2 = 400.0;
        System.out.println("Monto disponible para compras a crédito: " + cliente.getMontoDisponibleCredito());
        cliente.realizarCompraCredito(compra1);
        cliente.realizarCompraCredito(compra2);
        System.out.println("Se han realizado compras a crédito:");
        System.out.println("Compra 1: " + compra1);
        System.out.println("Compra 2: " + compra2);
        System.out.println("Saldo Deudor en Crédito: " + cliente.getSaldoDeudorCredito());
        System.out.println(" ");

        double pagoCredito = 700.0;
        cliente.realizarPagoCredito(pagoCredito);
        System.out.println("Se ha realizado un pago a la deuda de crédito de " + pagoCredito);
        System.out.println("Saldo Deudor en Crédito después del pago: " + cliente.getSaldoDeudorCredito());
        System.out.println(" ");

        cliente.cancelarInversion();
        System.out.println("La inversión ha sido cancelada.");
        System.out.println("Monto invertido, después de cancelar: " + cliente.getMontoInvertido());
        System.out.println(" ");

        double compra3 = 700.0;
        cliente.realizarCompraCredito(compra3);
        System.out.println("Se ha realizado una compra a crédito de " + compra3);
        System.out.println("Monto invertido, después de cancelar automáticamente: " + cliente.getMontoInvertido());
        System.out.println("Monto disponible, después de cancelar automáticamente: " + cliente.getMontoDisponible());
    }
}
