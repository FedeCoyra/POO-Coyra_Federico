package ar.edu.unlu.poo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Paquete {

    private String nombre;
    private String descripcion;
    private double valorDelPaquete;
    private Destino destino;
    private Transporte medioTransporte;
    private Hospedaje hospedaje;
    private List<Excursion> excursiones;


    public Paquete (String nombre, String descripcion, double valorDelPaquete, Destino destino, Transporte medioTransporte, Hospedaje hospedaje){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorDelPaquete = valorDelPaquete;
        this.destino = destino;
        this.medioTransporte = medioTransporte;
        this.hospedaje = hospedaje;
        this.excursiones = new ArrayList<>();
    }


    public void agregarExcursion(Excursion excursion){
        excursiones.add(excursion);
    }

    public double getValorDelPaquete() {
        return valorDelPaquete;
    }

    public String getNombre(){
        return nombre;
    }

    public Destino getDestino() {
        return destino;
    }
}