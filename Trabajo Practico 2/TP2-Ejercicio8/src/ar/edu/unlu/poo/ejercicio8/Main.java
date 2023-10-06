package ar.edu.unlu.poo.ejercicio8;

public class Main {
    public static void main(String[] args) {
        //Ejemplos
        Libro libro1 = new Libro("El misterio del mayordomo", "Norma Huidobro", "11-2333-4567", new CantidadEjemplares(10), "9789875457911");
        Revista revista1 = new Revista("Weekend", "Albanese Marcelo", "11-5477-2222", new CantidadEjemplares(5), "0043-1826");
        Diario diario1 = new Diario("Clarin", "Nicolas Diana", "11-2898-9001", "09-06-2023");
        Tesis tesis1 = new Tesis("Crónicas de 2023", "Esteban Edul","11-2112-3666", 2, 2023);

        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
        //Para agregar
        sistemaBiblioteca.agregarLibro(libro1);
        sistemaBiblioteca.agregarRevista(revista1);
        sistemaBiblioteca.agregarDiario(diario1);
        sistemaBiblioteca.agregarTesis(tesis1);
        //Para prestar
        sistemaBiblioteca.prestarLibro(libro1, 3);
        sistemaBiblioteca.prestarRevista(revista1, 2);
        sistemaBiblioteca.prestarDiario(diario1);
        sistemaBiblioteca.prestarTesis(tesis1);
    }
}
