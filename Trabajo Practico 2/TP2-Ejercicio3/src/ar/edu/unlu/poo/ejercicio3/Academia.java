package ar.edu.unlu.poo.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nombre;
    private List<Clase> diagramaciones = new ArrayList<>();

    public Academia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Clase> getDiagramaciones() {
        return diagramaciones;
    }

    public void agregarDiagramacion(Clase clase) {
        diagramaciones.add(clase);
    }

}