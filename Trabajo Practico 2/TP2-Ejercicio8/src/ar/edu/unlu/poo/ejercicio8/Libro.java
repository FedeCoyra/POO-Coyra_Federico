package ar.edu.unlu.poo.ejercicio8;

public class Libro extends Publicacion {
    private String isbn;

    public Libro(String nombre, String editor, String telefonoProveedor, CantidadEjemplares cantidadEjemplares, String isbn) {
        super(nombre, editor, telefonoProveedor, cantidadEjemplares);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + isbn + '\'' +
                "} " + super.toString();
    }

    public void prestar(int cantidad) {
        if (getCantidadEjemplares().getCantidad() >= cantidad) {
            getCantidadEjemplares().setCantidad(getCantidadEjemplares().getCantidad() - cantidad);
            System.out.println("Préstamo de Libro realizado:");
            System.out.println(this);
        } else {
            System.out.println("No hay suficientes ejemplares disponibles para el préstamo.");
        }
    }
}
