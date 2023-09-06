package ar.edu.unlu.poo.ejercicio6;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro + "\n");
        }
    }

    public int cantidadTotalPrestamos() {
        int totalPrestamos = 0;
        for (Libro libro : libros) {
            totalPrestamos += libro.getNumEjemplaresPrestados();
        }
        return totalPrestamos;
    }
}
