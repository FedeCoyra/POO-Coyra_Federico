package ar.edu.unlu.poo.ejercicio3;

import java.util.List;

public class CalculadoraImporte {
    public static void calcularImportePorProfesor(List<Profesor> profesores, List<Clase> diagramaciones) {
        System.out.println("\nImporte a pagar a los profesores");

        for (Profesor profesor : profesores) {
            int totalAsistencias = 0;
            for (Clase clase : diagramaciones) {
                if (clase.getProfesor().equals(profesor)) {
                    List<Alumno> alumnosInscritos = clase.getAlumnosInscritos();

                    for (Alumno alumno : alumnosInscritos) {
                        if (alumno.getAsistencia() > 0) {
                            totalAsistencias++;
                        }
                    }
                }
            }

            double importe = totalAsistencias * profesor.getSalarioPorClase();
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Asistencias totales: " + totalAsistencias);
            System.out.println("Importe a pagar: $" + importe);
            System.out.println();
        }
    }
}