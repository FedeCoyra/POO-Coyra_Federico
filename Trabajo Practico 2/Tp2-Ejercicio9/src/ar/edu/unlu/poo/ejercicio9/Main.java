package ar.edu.unlu.poo.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FiguraDosD circulo = new Circulo(5.0);
        FiguraDosD rectangulo = new Rectangulo(3.0, 4.0);
        FiguraDosD cuadrado = new Cuadrado(5.0);
        FiguraDosD triangulo = new Triangulo(4.0, 3.0);

        FiguraTresD esfera = new Esfera(3.0);
        FiguraTresD paralelepipedo = new Paralelepipedo(4.0, 5.0, 6.0);
        FiguraTresD cubo = new Cubo(5.0);
        FiguraTresD tetraedro = new Tetraedro(4.0);

        System.out.println("Area de las figuras de dos dimensiones:\n");
        System.out.println("Area del circulo: " + circulo.getArea());
        System.out.println("Area del rectangulo: " + rectangulo.getArea());
        System.out.println("Area del cuadrado: " + cuadrado.getArea());
        System.out.println("Area del triangulo: " + triangulo.getArea());
        System.out.println("\n");

        System.out.println("Volumen de las figuras de tres dimensiones:\n");
        if (esfera instanceof FiguraTresD) {
            FiguraTresD forma3D = (FiguraTresD) esfera;
            System.out.println("Volumen de la esfera: " + forma3D.getVolumen());
        }

        if (paralelepipedo instanceof FiguraTresD) {
            FiguraTresD forma3D = (FiguraTresD) paralelepipedo;
            System.out.println("Volumen del paralelepipedo: " + forma3D.getVolumen());
        }

        if (cubo instanceof FiguraTresD) {
            FiguraTresD forma3D = (FiguraTresD) cubo;
            System.out.println("Volumen del cubo: " + forma3D.getVolumen());
        }

        if (tetraedro instanceof FiguraTresD) {
            FiguraTresD forma3D = (FiguraTresD) tetraedro;
            System.out.println("Volumen del tetraedro: " + forma3D.getVolumen());
        }

        List<FiguraDosD> formas = new ArrayList<>();

        formas.add(esfera);
        formas.add(paralelepipedo);
        formas.add(cubo);
        formas.add(tetraedro);

        System.out.println("\nArea de las figuras de tres dimensiones:\n");
        for (FiguraDosD forma : formas) {
            System.out.println(forma.getClass().getSimpleName() + ": " + forma.getArea());
        }
    }
}
