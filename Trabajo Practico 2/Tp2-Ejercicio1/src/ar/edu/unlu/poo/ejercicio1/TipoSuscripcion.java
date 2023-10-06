package ar.edu.unlu.poo.ejercicio1;
import java.util.ArrayList;
import java.util.List;
public class TipoSuscripcion {
    private String nombre;
    private double cuota;
    private List<Actividad> actividadesPermitidas;

    public TipoSuscripcion(String nombre, double cuota) {
        this.nombre = nombre;
        this.cuota = cuota;
        this.actividadesPermitidas = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
        actividadesPermitidas.add(actividad);
    }

    public List<Actividad> getActividadesPermitidas() {
        return actividadesPermitidas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuota() {
        return cuota;
    }
}
