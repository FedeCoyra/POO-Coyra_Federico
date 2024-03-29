package ar.edu.unlu.poo.ejercicio8;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Contraseña {
    private static final String CARACTERES_PERMITIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_";
    private int longitud;
    private String contraseña;
    private String condicion;

    public Contraseña() {
        this.longitud = 8;
        generarContraseña();
    }

    public void PreguntarLongitud() {
        String opcion;
        System.out.println("La longitud de la contraseña actual es " + this.longitud + " caracteres.");
        System.out.println("¿Desea modificarla? (si/no), recuerde que no debe ser una longitud menor a 8 caracteres.");
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        opcion = sc.nextLine();

        if (Objects.equals(opcion, "si")) {
            System.out.println("¿De que longitud desea que sea la contraseña?: \n");
            this.longitud = sc.nextInt();
            sc.nextLine();
            generarContraseña();
            System.out.println("Has elegido que el largo de la contraseña sea de " + this.longitud + " caracteres.");
        } else if (Objects.equals(opcion, "no")) {
            System.out.println("El largo de la contraseña permanecerá en " + this.longitud + " caracteres.");
        } else {
            System.out.println("Opción incorrecta, intente nuevamente.");
            return;
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void cambiarLongitud(int nuevaLongitud) {
        this.longitud = nuevaLongitud;
        generarContraseña();
    }

    private void generarContraseña() {
        Random random = new Random();
        StringBuilder contraseñaGenerada = new StringBuilder();
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;


        while (true) {
            contraseñaGenerada.setLength(0);

            for (int i = 0; i < longitud; i++) {
                int indice = random.nextInt(CARACTERES_PERMITIDOS.length());
                char caracter = CARACTERES_PERMITIDOS.charAt(indice);
                contraseñaGenerada.append(caracter);

                if (Character.isUpperCase(caracter)) {
                    mayusculas++;
                } else if (Character.isLowerCase(caracter)) {
                    minusculas++;
                } else if (Character.isDigit(caracter)) {
                    numeros++;
                }
            }

            if (mayusculas > 2 && minusculas > 1 && numeros > 1) {
                condicion = "Fuerte";
                break;
            } else {
                condicion = "Debil";
                mayusculas = 0;
                minusculas = 0;
                numeros = 0;
            }
        }

        contraseña = contraseñaGenerada.toString();
    }

    public String getCondicion () {
        return condicion;
    }

}