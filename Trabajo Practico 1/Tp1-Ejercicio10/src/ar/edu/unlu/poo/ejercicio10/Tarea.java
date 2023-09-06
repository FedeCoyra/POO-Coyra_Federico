package ar.edu.unlu.poo.ejercicio10;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completa;
    private final LocalDate fechaLimite;
    private LocalDate recordatorio;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completa = false;
        this.recordatorio = null;
    }

    public void setDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad){
        this.prioridad = nuevaPrioridad;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void marcarComoCompleta(){
        this.completa = true;
    }

    public boolean estaVencida(){
        return !completa && LocalDate.now().isAfter(fechaLimite);
    }

    public boolean estaCompleta(){
        return completa;
    }

    public void setrecordatorio(LocalDate recordatorio){
        this.recordatorio = recordatorio;
    }

    public LocalDate getrecordatorio(){
        return recordatorio;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String mostrarTarea(){
        if (estaCompleta()){
            return "(Completa) " + descripcion;
        }
        else if (estaVencida()){
            return "(Vencida) " + descripcion;
        }
        else {
            String queRetorna = "";
            LocalDate hoy = LocalDate.now();

            if (recordatorio != null && recordatorio.isAfter(hoy)){
                queRetorna = "(Por vencer) ";
            }

            return queRetorna + descripcion;
        }
    }
}
