package ar.edu.unlu.poo.ejercicio8;

public class Revista extends Publicacion {
    private String issn;

    public Revista(String nombre, String editor, String telefonoProveedor, CantidadEjemplares cantidadEjemplares, String issn) {
        super(nombre, editor, telefonoProveedor, cantidadEjemplares);
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "ISSN='" + issn + '\'' +
                "} " + super.toString();
    }

    public void prestar(int cantidad) {
        if (getCantidadEjemplares().getCantidad() >= cantidad) {
            getCantidadEjemplares().setCantidad(getCantidadEjemplares().getCantidad() - cantidad);
            System.out.println("Préstamo de Revista realizado:");
            System.out.println(this);
        } else {
            System.out.println("No hay suficientes ejemplares disponibles para el préstamo.");
        }
    }
}
