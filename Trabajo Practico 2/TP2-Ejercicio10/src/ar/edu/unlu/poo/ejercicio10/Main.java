package ar.edu.unlu.poo.ejercicio10;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Gonzalo", "Montiel", "11-3392-9021", "20-40323342-4", new Date(), 3000);
        Empleado empleadoPorComision = new EmpleadoPorComision("Juan", "Quintero", "11-3021-1806", "20-39324348-7", new Date(), 50000, 2.5);
        Empleado empleadoPorComisionConSalarioBase = new EmpleadoPorComisionConSalarioBase("Esequiel", "Barco", "11-2222-0043", "20-37323549-1", new Date(), 60000, 2.0, 1500);
        Empleado empleadoPorHora = new EmpleadoPorHora("Martin", "Demichelis", "11-2042-0000", "20-22702508-4", new Date(), 10, 45);
        Empleado empleadoPasante = new EmpleadoPasante("Facundo", "Colidio", "11-2018-8921", "20-44326661-5", new Date());

        System.out.println("Empleado: " + empleadoAsalariado.getNombreCompleto() + ". Sueldo de empleado asalariado: $" + empleadoAsalariado.calcularSueldo());
        System.out.println("Empleado: " + empleadoPorComision.getNombreCompleto() + ". Sueldo de empleado por comisión: $" + empleadoPorComision.calcularSueldo());
        System.out.println("Empleado: " + empleadoPorComisionConSalarioBase.getNombreCompleto() + ". Sueldo de empleado por comisión con salario base: $" + empleadoPorComisionConSalarioBase.calcularSueldo());
        System.out.println("Empleado: " + empleadoPorHora.getNombreCompleto() + ". Sueldo de empleado por hora: $" + empleadoPorHora.calcularSueldo());
        System.out.println("Empleado: " + empleadoPasante.getNombreCompleto() + ". Sueldo de empleado pasante: $" + empleadoPasante.calcularSueldo());
    }
}