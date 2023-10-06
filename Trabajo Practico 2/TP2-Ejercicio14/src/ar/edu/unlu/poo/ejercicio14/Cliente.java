package ar.edu.unlu.poo.ejercicio14;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Paquete> compras = new ArrayList<>();
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void comprarPaquete(Paquete paquete) {
        compras.add(paquete);
    }
    public List<Paquete> getCompras() {
        return compras;
    }
    public String getNombre() {
        return nombre;
    }
}
