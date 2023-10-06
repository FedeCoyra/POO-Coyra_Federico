package ar.edu.unlu.poo.ejercicio13;

public class Main{
    public static void main(String[] argumentos){
        Pasajero pasajero = new Pasajero("Federico", "11-3021-0678", "Rivadavia 312", "23");
        Tripulante tripulante = new Tripulante("Nahuel", "11-9290-7755", "Antezana 247", "Piloto");
        Pasajero pasajero1 = new Pasajero("Carlos", "11-2270-2053", "Liverpool 412", "67");
        Pasajero pasajero2 = new Pasajero("Lucas", "11-2459-4551", "Gorriti 3018", "102");

        Vuelo vuelo = new Vuelo(36, "11-10-2017", "Buenos Aires", "Australia");
        vuelo.agregarPersona(pasajero);
        vuelo.agregarPersona(pasajero1);
        vuelo.agregarPersona(pasajero2);
        vuelo.agregarPersona(tripulante);

        System.out.println("\nPERSONAS ABORDO DEL VUELO:");

        for (Persona persona : vuelo.getMiembrosVuelo()){

            System.out.printf("NOMBRE: %s\n", persona.getNombre());

            if (persona instanceof Pasajero){
                System.out.printf("NUMERO DE PASAJERO: %s\n", ((Pasajero) persona).getNumeroDePasajero());
                System.out.println();
            }
            else if (persona instanceof Tripulante){
                System.out.printf("CARGO: %s\n\n", ((Tripulante) persona).getCargo());
            }
        }
    }
}
