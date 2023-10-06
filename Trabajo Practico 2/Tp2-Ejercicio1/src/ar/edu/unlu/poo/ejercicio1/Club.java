package ar.edu.unlu.poo.ejercicio1;
import java.util.ArrayList;
import java.util.List;
public class Club {
    private List<Socio> socios;
    private List<TipoSuscripcion> tiposSuscripcion;

    public Club() {
        this.socios = new ArrayList<>();
        this.tiposSuscripcion = new ArrayList<>();

        TipoSuscripcion basica = new TipoSuscripcion("Básica", 300);
        basica.agregarActividad(new Actividad("Natación"));

        TipoSuscripcion intermedia = new TipoSuscripcion("Intermedia", 500);
        intermedia.agregarActividad(new Actividad("Natación"));
        intermedia.agregarActividad(new Actividad("Fútbol"));

        TipoSuscripcion destacada = new TipoSuscripcion("Destacada", 1200);
        destacada.agregarActividad(new Actividad("Natación"));
        destacada.agregarActividad(new Actividad("Fútbol"));
        destacada.agregarActividad(new Actividad("Tenis"));

        tiposSuscripcion.add(basica);
        tiposSuscripcion.add(intermedia);
        tiposSuscripcion.add(destacada);
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void listaActividadesPorSuscripcion() {
        for (TipoSuscripcion tipoSuscripcion : tiposSuscripcion) {
            System.out.printf("\nLista de actividades permitidas para la Suscripción %s:\n",
                    tipoSuscripcion.getNombre());
            int contador = 0;
            for (Actividad actividad : tipoSuscripcion.getActividadesPermitidas()) {
                System.out.printf("%d. %s\n", ++contador, actividad.getNombreActividad());
            }
        }
    }

    public void listaSociosPorSuscripcion(String tipoDeSuscripcion) {
        System.out.printf("\n\nLista de socios con Suscripción '%s': \n\n", tipoDeSuscripcion);
        int contador = 0;
        for (Socio socio : socios) {
            if (socio.getTipoSuscripcion().getNombre().equals(tipoDeSuscripcion)) {
                ++contador;
                System.out.printf("\n%d. Socio: %s\n", contador, socio.getNombre());
                System.out.printf("Direccion: %s\n", socio.getDireccion());
                System.out.printf("DNI: %s\n", socio.getDni());
                System.out.printf("E-mail: %s\n", socio.getEmail());
            }
        }
    }

    public void listaNuevosSocios() {
        System.out.println("Socios inscriptos en el mes:\n");
        int contador = 0;

        for (Socio socio : socios) {
            contador++;
            System.out.printf("\n%d. Socio: %s\n", contador, socio.getNombre());
            System.out.printf("Direccion: %s\n", socio.getDireccion());
            System.out.printf("DNI: %s\n", socio.getDni());
            System.out.printf("E-mail: %s\n", socio.getEmail());
            System.out.printf("Tipo de suscripción: %s\n", socio.getTipoSuscripcion().getNombre());
        }

        System.out.printf("\nNúmero de socios inscriptos en el mes: %d\n\n", contador);
    }
}
