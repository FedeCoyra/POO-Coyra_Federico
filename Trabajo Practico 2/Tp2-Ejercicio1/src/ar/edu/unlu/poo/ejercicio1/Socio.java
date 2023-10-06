package ar.edu.unlu.poo.ejercicio1;

public class Socio {
    private String nombre;
    private String dni;
    private String direccion;
    private String email;
    private TipoSuscripcion tipoSuscripcion;

    public Socio(String nombre, String dni, String direccion, String email, TipoSuscripcion tipoSuscripcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public TipoSuscripcion getTipoSuscripcion() {
        return tipoSuscripcion;
    }
}
