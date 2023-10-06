package ar.edu.unlu.poo.ejercicio2;

public class Compra {

    private Cliente comprador;
    private Paquete paquete;
    private double valor;

    public Compra(Cliente comprador, Paquete paquete){
        this.comprador = comprador;
        this.paquete = paquete;
        this.valor = paquete.getValorDelPaquete();
    }

    public Paquete getPaquete() {
        return paquete;
    }
}