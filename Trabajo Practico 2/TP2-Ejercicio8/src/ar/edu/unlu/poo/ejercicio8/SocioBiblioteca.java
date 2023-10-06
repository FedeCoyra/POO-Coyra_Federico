package ar.edu.unlu.poo.ejercicio8;

public class SocioBiblioteca {
    private String nombre;
    private String numeroSocio;

    public SocioBiblioteca(String nombre, String numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    @Override
    public String toString() {
        return "SocioBiblioteca{" +
                "nombre='" + nombre + '\'' +
                ", numeroSocio='" + numeroSocio + '\'' +
                '}';
    }
}