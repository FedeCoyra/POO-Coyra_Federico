package ar.edu.unlu.poo.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String dni;
    private String telefono;
    private List<Venta> ventas;

    public Empleado(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.ventas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void registrarVenta(Venta venta){
        ventas.add(venta);
    }
    public List<Venta> getVentas() {
        return ventas;
    }
    public double getTotalDeVentas(){
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.getLitrosVendidos();
        }
        return total;
    }
}