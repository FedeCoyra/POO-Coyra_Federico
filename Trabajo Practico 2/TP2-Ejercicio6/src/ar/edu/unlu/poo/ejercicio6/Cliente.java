package ar.edu.unlu.poo.ejercicio6;

public class Cliente{
    private String patente;
    private String nombre;

    public Cliente(String patente, String nombre){
        this.patente = patente;
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }
}