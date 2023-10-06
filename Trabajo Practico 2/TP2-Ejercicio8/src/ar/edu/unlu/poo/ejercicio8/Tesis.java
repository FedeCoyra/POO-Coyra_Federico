package ar.edu.unlu.poo.ejercicio8;

public class Tesis {
    private String nombre;
    private String autor;
    private int mesPublicacion;
    private int anioPublicacion;
    private String telefonoProveedor;

    public Tesis(String nombre, String autor, String telefonoProveedor, int mesPublicacion, int anioPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.telefonoProveedor = telefonoProveedor;
        this.mesPublicacion = mesPublicacion;
        this.anioPublicacion = anioPublicacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }
    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
    public int getMesPublicacion() {
        return mesPublicacion;
    }
    public void setMesPublicacion(int mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public void prestar() {
        System.out.println("Préstamo de la tesis " + nombre + " realizado.");
    }

    @Override
    public String toString() {
        return "Tesis{" +
                "NOMBRE= '" + nombre + '\'' +
                ", AUTOR= '" + autor + '\'' +
                ", TELEFONO= '" + telefonoProveedor + '\'' +
                ", MES= " + mesPublicacion + '\'' +
                ", AÑO= " + anioPublicacion + '\'' +
                '}'+"\n";
    }
}