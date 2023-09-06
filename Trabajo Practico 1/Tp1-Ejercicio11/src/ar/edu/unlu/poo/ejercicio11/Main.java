package ar.edu.unlu.poo.ejercicio11;

public class Main {
    public static void main(String[] argumentos){

        Jugador jugador1 = new Jugador("Fede", 3);
        Jugador jugador2 = new Jugador("Tomas", 3);


        //Jugador Fede
        jugador1.intentoDelJugador("kiwi");
        jugador1.intentoDelJugador("walmart");
        jugador1.intentoDelJugador("hola");

        //Jugador Tomas
        jugador2.intentoDelJugador("mamut");
        jugador2.intentoDelJugador("terremoto");
        jugador2.intentoDelJugador("mani");
        //Reemplazar con las mismas palabras para testear el empate.


        if (jugador1.puntajeDelJugador() > jugador2.puntajeDelJugador()){
            System.out.printf("%s es el ganador, el resultado fue %d-%d.", jugador1.nombreJugador(), jugador1.puntajeDelJugador(), jugador2.puntajeDelJugador());
        }
        else if (jugador2.puntajeDelJugador() > jugador1.puntajeDelJugador()){
            System.out.printf("%s es el ganador, el resultado fue %d-%d.", jugador2.nombreJugador(), jugador2.puntajeDelJugador(), jugador1.puntajeDelJugador());
        }
        else{
            System.out.printf("¡Es un empate!¡Ambos tuvieron %d puntos!", jugador1.puntajeDelJugador());
        }
    }
}