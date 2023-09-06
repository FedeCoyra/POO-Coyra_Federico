package ar.edu.unlu.poo.ejercicio8;

public class Main {
    public static void main(String[] args) {

        Contraseña generador = new Contraseña();
        generador.PreguntarLongitud();
        System.out.println( "< " + generador.getContraseña() + " > - " + generador.getCondicion());
        System.out.println("Largo de la contraseña: " + generador.getLongitud());

    }
}
