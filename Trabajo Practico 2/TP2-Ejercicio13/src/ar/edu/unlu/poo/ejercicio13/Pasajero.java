package ar.edu.unlu.poo.ejercicio13;

public class Pasajero extends Persona{
    private String numeroDePasajero;
    private Ticket ticket;

    public Pasajero(String nombre, String numeroTelefono, String direccion, String numeroDePasajero) {
        super(nombre, numeroTelefono, direccion);
        this.numeroDePasajero = numeroDePasajero;
    }
    public String getNumeroDePasajero(){
        return numeroDePasajero;
    }
}
