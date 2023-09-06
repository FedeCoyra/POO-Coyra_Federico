package ar.edu.unlu.poo.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDate mañana = LocalDate.now().plusDays(1);
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate hoy = LocalDate.now();

        List<Tarea> listaTareas = new ArrayList<>();

        Tarea tarea1 = new Tarea("Ir al supermercado mañana", 4, hoy);
        tarea1.modificarDescripcion("Cambiar aceite de la moto");
        tarea1.cambiarPrioridad(1);

        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 2, ayer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 3, ayer);

        tarea2.marcarComoCompleta();
        listaTareas.add(tarea1);
        listaTareas.add(tarea2);
        listaTareas.add(tarea3);
        System.out.print("\n");

        for (int i = 0; i < listaTareas.size(); i++) {
            Tarea tarea = listaTareas.get(i);
            System.out.println("Tarea " + tarea.tareaPrioridad() + ": " + tarea.mostrarTarea());

            if (!tarea.estaCompleta()) {
                System.out.println("¿Esta vencida? " + tarea.estaVencida());
                System.out.println("¿Esta completa? " + tarea.estaCompleta());
            }
            System.out.println("\n");
        }
    }
}
