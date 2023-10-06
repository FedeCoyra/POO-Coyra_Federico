package ar.edu.unlu.poo.ejercicio1;

public class Main {
    public static void main(String[] argumentos) {
        Club club = new Club();


        TipoSuscripcion basica = new TipoSuscripcion("Básica", 300);
        TipoSuscripcion intermedia = new TipoSuscripcion("Intermedia", 500);
        TipoSuscripcion destacada = new TipoSuscripcion("Destacada", 1200);

        basica.agregarActividad(new Actividad("Natación"));
        intermedia.agregarActividad(new Actividad("Natación"));
        intermedia.agregarActividad(new Actividad("Fútbol"));
        destacada.agregarActividad(new Actividad("Natación"));
        destacada.agregarActividad(new Actividad("Fútbol"));
        destacada.agregarActividad(new Actividad("Tenis"));

        Socio socio1 = new Socio("Federico", "44532300", "Rivadavia 2000", "fedec@gmail.com", basica);
        Socio socio2 = new Socio("Lucas", "42393021", "Independencia 645", "lucasmc@gmail.com", intermedia);
        Socio socio3 = new Socio("Tomas", "49517611", "Ruta 2 2006", "tomas123@gmail.com", destacada);
        Socio socio4 = new Socio("Martin", "22702642", "Chazarreta 898", "martin22702@gmail.com", basica);


        club.agregarSocio(socio1);
        club.agregarSocio(socio2);
        club.agregarSocio(socio3);
        club.agregarSocio(socio4);

        System.out.println();
        club.listaNuevosSocios();
        club.listaActividadesPorSuscripcion();
        club.listaSociosPorSuscripcion("Básica");
    }
}
