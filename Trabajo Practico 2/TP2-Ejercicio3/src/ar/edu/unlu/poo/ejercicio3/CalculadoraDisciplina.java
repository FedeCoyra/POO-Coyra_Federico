package ar.edu.unlu.poo.ejercicio3;

import java.util.ArrayList;
import java.util.List;
public class CalculadoraDisciplina {
    public static String calcularDisciplinaConMayorIngresos(List<Clase> diagramaciones) {
        List<DisciplinaIngresos> ingresosPorDisciplina = new ArrayList<>();

        for (Clase clase : diagramaciones) {
            String disciplina = clase.getDisciplina();
            double importe = clase.getProfesor().getSalarioPorClase() * clase.getAlumnosInscritos().size();

            boolean encontrada = false;
            for (DisciplinaIngresos disciplinaIngresos : ingresosPorDisciplina) {
                if (disciplinaIngresos.disciplina.equals(disciplina)) {
                    disciplinaIngresos.ingresos += importe;
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) {
                ingresosPorDisciplina.add(new DisciplinaIngresos(disciplina, importe));
            }
        }

        String disciplinaConMayorIngresos = null;
        double mayorIngreso = 0.0;

        for (DisciplinaIngresos disciplinaIngresos : ingresosPorDisciplina) {
            if (disciplinaIngresos.ingresos > mayorIngreso) {
                mayorIngreso = disciplinaIngresos.ingresos;
                disciplinaConMayorIngresos = disciplinaIngresos.disciplina;
            }
        }

        return disciplinaConMayorIngresos;
    }

    private static class DisciplinaIngresos {
        String disciplina;
        double ingresos;

        DisciplinaIngresos(String disciplina, double ingresos) {
            this.disciplina = disciplina;
            this.ingresos = ingresos;
        }
    }
}