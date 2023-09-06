package ar.edu.unlu.poo.ejercicio13;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] argumentos) {

        LocalDate anteAyer = LocalDate.now().minusDays(2);
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate hoy = LocalDate.now();
        LocalDate mañana = LocalDate.now().plusDays(1);
        LocalDate pasadoMañana = LocalDate.now().plusDays(2);

        ListaDeTarea listaTareas = new ListaDeTarea();

        Colaborador colaborador = new Colaborador("Fede");
        Colaborador colaborador2 = new Colaborador("Tomas");

        Tarea tarea1 = new Tarea("Cambiar aceite de la moto", 2, mañana);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 4, hoy);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 1, ayer);
        Tarea tarea4 = new Tarea("Llenar la pecera con agua", 5, pasadoMañana);
        Tarea tarea5 = new Tarea("Limpiar el auto", 3, anteAyer);
        Tarea tarea6 = new Tarea("Cortar el pasto", 7, hoy);

        listaTareas.agregarTarea(tarea1);
        listaTareas.agregarTarea(tarea2);
        listaTareas.agregarTarea(tarea3);
        listaTareas.agregarTarea(tarea4);
        listaTareas.agregarTarea(tarea5);
        listaTareas.agregarTarea(tarea6);

        LocalDate fechaDeCompletado = LocalDate.now().minusDays(7);
        LocalDate fechaDeCompletado2 = LocalDate.now().minusDays(4);
        LocalDate fechaDeCompletado3 = LocalDate.now().minusDays(9);
        LocalDate fechaDeCompletado4 = LocalDate.now().minusDays(2);

        listaTareas.marcarTareaComoCompletada(tarea1, colaborador, fechaDeCompletado);
        listaTareas.marcarTareaComoCompletada(tarea5, colaborador, fechaDeCompletado4);
        listaTareas.marcarTareaComoCompletada(tarea2, colaborador2, fechaDeCompletado2);
        listaTareas.marcarTareaComoCompletada(tarea3, colaborador2, fechaDeCompletado3);

        List<Tarea> tareasFede = listaTareas.getTareasColaborador(colaborador);
        List<Tarea> tareasTomas = listaTareas.getTareasColaborador(colaborador2);


        System.out.println("Tareas completadas por Fede:");
        for (Tarea tarea : tareasFede) {
            System.out.printf("Tarea: '%s' completada el %s\n\n", tarea.getDescripcion(), tarea.getFechaDeCompletado());
        }

        System.out.println("Tareas completadas por Tomas:");
        for (Tarea tarea : tareasTomas) {
            System.out.printf("Tarea: '%s' completada el %s\n\n", tarea.getDescripcion(), tarea.getFechaDeCompletado());
        }

    }
}