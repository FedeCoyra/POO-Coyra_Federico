package ar.edu.unlu.poo.ejercicio10;
import java.util.Date;
public class EmpleadoPorComisionConSalarioBase extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoPorComisionConSalarioBase(String nombre, String apellido, String telefono, String cuit, Date fechaNacimiento, double ventasBrutas, double porcentajeComision, double salarioBase) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento, ventasBrutas, porcentajeComision);
        this.salarioBase = salarioBase;
    }

    @Override
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = super.calcularSueldo() + salarioBase;
        if (esMesDeCumpleanos()) {
            sueldo += 1000;  // Bono por cumpleaños
        }
        return sueldo;
    }
}