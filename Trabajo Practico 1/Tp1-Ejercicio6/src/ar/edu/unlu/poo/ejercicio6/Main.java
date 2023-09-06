package ar.edu.unlu.poo.ejercicio6;

public class Main {
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    Libro libro1 = new Libro("El misterio del mayordomo", "Norma Huidobro", 138, 10);
    Libro libro2 = new Libro("Rayuela", "Julio Cortázar", 728, 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        libro2.prestar();
        libro2.devolver(); //Este lo devuelve
        libro2.prestar();
        libro2.prestar(); //Este no lo presta porque solo tenia 1 ejemplar y se pidieron 2

        biblioteca.mostrarLibros();

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
        System.out.println("El libro '" + libro1.getTitulo() + "' tiene mas paginas.");
        } else {
        System.out.println("El libro '" + libro2.getTitulo() + "' tiene mas paginas.\n");
        }
        System.out.println("Cantidad total de prestamos: " + biblioteca.cantidadTotalPrestamos());
    }
}