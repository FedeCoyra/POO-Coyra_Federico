package ar.edu.unlu.poo.ejercicio10;
import java.util.Date;
class EmpleadoPorHora extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String cuit, Date fechaNacimiento, double salarioPorHora, int horasTrabajadas) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = salarioPorHora * horasTrabajadas;
        if (horasTrabajadas > 40) {
            sueldo *= 1.20;  // 20% más por trabajar + de 40 horas
        }
        if (esMesDeCumpleanos()) {
            sueldo += 2000;  // Bono por cumpleaños
        }
        return sueldo;
    }
}