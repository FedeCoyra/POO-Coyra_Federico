package ar.edu.unlu.poo.ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        Academia academia = new Academia("Academia de danzas Termas");

        Profesor profesor1 = new Profesor("Manuel Rodriguez");
        Profesor profesor2 = new Profesor("Jorge Sampaoli");

        Clase clase1 = new Clase("Lunes", "12:00 - 14:00", "Inicial", "Reggaeton", profesor1);
        Clase clase2 = new Clase("Miercoles", "20:00 - 22:00", "Intermedio", "Salsa", profesor2);

        Alumno alumno1 = new Alumno("Ernesto Perez", "ernestoperez@hotmail.com", "Credencial1");
        Alumno alumno2 = new Alumno("Leandro Paredes", "leandro5@gmail.com", "Credencial2");
        Alumno alumno3 = new Alumno("Gonzalo Martinez", "pitym@yahoo.com.ar", "Credencial3");

        academia.agregarDiagramacion(clase1);
        academia.agregarDiagramacion(clase2);

        clase1.inscribirAlumno(alumno1);
        clase1.inscribirAlumno(alumno2);
        clase2.inscribirAlumno(alumno3);

        List<Profesor> profesores = new ArrayList<>();
        profesores.add(profesor1);
        profesores.add(profesor2);

        System.out.println("\nInformación de la Academia");
        System.out.println("Nombre de la academia: " + academia.getNombre());

        System.out.println("\nDiagramaciones de la Academia");
        for (Clase clase : academia.getDiagramaciones()) {
            System.out.println("Día: " + clase.getDia() + ", Horario: " + clase.getHorario());
            System.out.println("Profesor: " + clase.getProfesor().getNombre());

            System.out.println("Alumnos inscriptos:");
            for (Alumno alumno : clase.getAlumnosInscritos()) {
                System.out.println("- " + alumno.getNombre() + " (Credencial: " + alumno.getCredencial() + ")");
            }
            System.out.println();
        }

        System.out.println(" ");
        alumno2.marcarAsistencia();
        alumno2.marcarAsistencia();
        alumno1.marcarAsistencia();
        alumno1.marcarAsistencia();
        alumno1.marcarAsistencia();
        alumno3.marcarAsistencia();
        System.out.println(" ");
        alumno1.imprimirAsistencias();
        alumno2.imprimirAsistencias();
        alumno3.imprimirAsistencias();

        CalculadoraImporte.calcularImportePorProfesor(profesores, academia.getDiagramaciones());
        System.out.println(" ");
        String disciplinaMayorIngresos = CalculadoraDisciplina.calcularDisciplinaConMayorIngresos(academia.getDiagramaciones());
        System.out.println("La disciplina con mayores ingresos es: " + disciplinaMayorIngresos);
    }
}

