package ar.edu.unlu.poo.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String contacto;
    private String credencial;
    private int asistencia = 0;
    private List<Clase> claseInscritas = new ArrayList<>();
    public Alumno(String nombre, String contacto, String credencial) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.credencial = credencial;
        this.asistencia = 0;
    }
    public void marcarAsistencia(){
        asistencia ++;
        System.out.println("Presente al alumno: " + nombre );
    }
    public String getNombre() {
        return nombre;
    }
    public void imprimirAsistencias() {
        System.out.println("Asistencias de " + nombre + ": " + asistencia);
    }
    public String getCredencial() {
        return credencial;
    }
    public int getAsistencia() {
        return asistencia;
    }

}
