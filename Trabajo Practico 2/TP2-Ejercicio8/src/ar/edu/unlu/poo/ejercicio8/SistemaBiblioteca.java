package ar.edu.unlu.poo.ejercicio8;

import java.util.ArrayList;
import java.util.List;
public class SistemaBiblioteca {

    private List<Libro> libros;
    private List<Revista> revistas;
    private List<Diario> diarios;
    private List<Tesis> tesis;
    public SistemaBiblioteca() {
        this.libros = new ArrayList<>();
        this.revistas = new ArrayList<>();
        this.diarios = new ArrayList<>();
        this.tesis = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarRevista(Revista revista) {
        revistas.add(revista);
    }

    public void agregarDiario(Diario diario) {
        diarios.add(diario);
    }

    public void agregarTesis(Tesis tesis) {
        this.tesis.add(tesis);
    }


    public void prestarLibro(Libro libro, int cantidad) {
        for (Libro l : libros) {
            if (l.equals(libro)) {
                l.prestar(cantidad);
                return;
            }
        }
        System.out.println("El libro no se encuentra en el inventario.");
    }

    public void prestarRevista(Revista revista, int cantidad) {
        for (Revista r : revistas) {
            if (r.equals(revista)) {
                r.prestar(cantidad);
                return;
            }
        }
        System.out.println("La revista no se encuentra en el inventario.");
    }

    public void prestarDiario(Diario diario) {
        System.out.println("Préstamo de Diario realizado:");
        System.out.println(diario);
    }

    public void prestarTesis(Tesis tesis) {
        System.out.println("Préstamo de Tesis realizado:");
        System.out.println(tesis);
    }

}