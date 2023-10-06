package ar.edu.unlu.poo.ejercicio9;

class Circulo extends FiguraDosD {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}
