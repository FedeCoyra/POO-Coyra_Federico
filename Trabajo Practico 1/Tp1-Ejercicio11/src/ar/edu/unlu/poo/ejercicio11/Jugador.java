package ar.edu.unlu.poo.ejercicio11;

public class Jugador {
    private String nombre;
    private String[] palabrasValidas;
    private int palabrasFormadas;

    public String nombreJugador(){
        return nombre;
    }

    public int puntajeDelJugador(){
        int puntaje=0;

        for (int i = 0; i < palabrasValidas.length; i++){
            String palabraTemp = palabrasValidas[i];
            if (palabraTemp != null){
                puntaje += palabraTemp.length();

                for (char letraPalabra : palabraTemp.toCharArray()){
                    if ("kzxwq".contains(String.valueOf(letraPalabra))){
                        puntaje++;
                    }
                }
            }
        }
        return puntaje;
    }

    public Jugador(String nombre, int maximoDeIntentos){
        this.nombre = nombre;
        this.palabrasValidas = new String[maximoDeIntentos];
        this.palabrasFormadas = 0;
    }

    public void intentoDelJugador(String palabra){
        if (Diccionario.palabraValida(palabra) && palabrasFormadas <= (palabrasValidas.length)/2){
            palabrasValidas[palabrasFormadas] = palabra;
            palabrasFormadas++;
        }
    }



}
