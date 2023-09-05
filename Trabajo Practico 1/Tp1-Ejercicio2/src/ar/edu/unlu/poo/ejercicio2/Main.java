package ar.edu.unlu.poo.ejercicio2;

public class Main {
    public static void main(String[] argumentos){

        EnlazadaDoble lista = new EnlazadaDoble();

        if (lista.listaVacia()){
            System.out.println("\nLa lista esta vacia, inserte elementos.\n");
        }

        lista.addElemento(1);
        lista.addElemento(2);
        lista.addElemento(3);
        lista.addElemento(4);
        lista.addElemento(5);


        lista.mostrarLista();

        lista.insertarElemento(110, 3);
        System.out.println("Lista despues de insertar en la tercera posición: \n");
        lista.mostrarLista();

        System.out.printf("La lista tiene %d elementos.\n",lista.listaLargo());

        System.out.printf("\nEl elemento de la posicion 3 es %s\n", lista.recuperarElemento(3));
    }
}