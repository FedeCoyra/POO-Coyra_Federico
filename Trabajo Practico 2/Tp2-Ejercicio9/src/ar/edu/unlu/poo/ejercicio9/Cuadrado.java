package ar.edu.unlu.poo.ejercicio9;

public class Cuadrado extends FiguraDosD {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
