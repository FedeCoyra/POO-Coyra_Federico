package ar.edu.unlu.poo.ejercicio13;

public class Tripulante extends Persona {
    private String cargo;
    public Tripulante(String nombre, String numeroTelefono, String direccion, String cargo){
        super(nombre, numeroTelefono, direccion);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
}
