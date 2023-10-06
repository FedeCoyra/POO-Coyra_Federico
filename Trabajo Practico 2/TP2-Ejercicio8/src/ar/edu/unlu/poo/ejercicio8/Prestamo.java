package ar.edu.unlu.poo.ejercicio8;

public class Prestamo {
    private Publicacion publicacion;
    private SocioBiblioteca socio;

    public Prestamo(Publicacion publicacion, SocioBiblioteca socio) {
        this.publicacion = publicacion;
        this.socio = socio;
    }
    public Publicacion getPublicacion() {
        return publicacion;
    }
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    public SocioBiblioteca getSocio() {
        return socio;
    }
    public void setSocio(SocioBiblioteca socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "publicacion=" + publicacion +
                ", socio=" + socio +
                '}';
    }
}