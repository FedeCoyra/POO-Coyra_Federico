package ar.edu.unlu.poo.ejercicio10;
import java.util.Date;
public class EmpleadoPasante extends Empleado {
    public EmpleadoPasante(String nombre, String apellido, String telefono, String cuit, Date fechaNacimiento) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento);
    }

    @Override
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public double calcularSueldo() {
        return 0;  // Siempre es cero
    }
}