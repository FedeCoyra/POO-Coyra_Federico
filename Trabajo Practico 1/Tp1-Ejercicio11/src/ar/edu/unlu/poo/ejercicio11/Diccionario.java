package ar.edu.unlu.poo.ejercicio11;

public class Diccionario {
    private static String[] listaPalabras = {"mamut", "otorrino", "kiwi", "walmart", "quito", "flamenco", "aterrizar", "colocar", "camioon", "nariz", "perro", "gato"};

    public static boolean palabraValida(String palabraEvaluar){
        for (int i = 0; i < listaPalabras.length; i++){
            String palabraTemp = listaPalabras[i];
            if (palabraTemp.equals(palabraEvaluar)){
                return true;
            }
        }
        return false;
    }
}
