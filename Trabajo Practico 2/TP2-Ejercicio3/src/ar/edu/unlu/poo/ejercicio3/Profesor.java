package ar.edu.unlu.poo.ejercicio3;

public class Profesor {
    private String nombre;
    private double salarioPorClase = 10.0;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalarioPorClase() {
        return salarioPorClase;
    }

}