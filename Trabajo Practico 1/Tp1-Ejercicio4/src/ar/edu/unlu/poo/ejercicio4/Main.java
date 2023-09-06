package ar.edu.unlu.poo.ejercicio4;

public class Main {
    public static void main(String[] argumentos) {
        Cola cola = new Cola();

        if (cola.colaVacia()) {
            System.out.println("\nLa cola esta vacia, inserte elementos.\n");
        }

        cola.encolarElemento(1);
        cola.encolarElemento(3);
        cola.encolarElemento(4);
        cola.encolarElemento(7);
        cola.encolarElemento(9);

        cola.mostrarCola();

        if (!cola.colaVacia()) {
            System.out.println("La cola ya no esta vacia\n");
        }

        System.out.println("Muestro de nuevo para controlar que no se pierde:\n");
        cola.mostrarCola();

        System.out.printf("Frente de la cola: %s\n", cola.recuperarFrente());
        System.out.printf("Final de la cola: %s\n", cola.recuperarFinal());

        cola.desencolarElemento();
        System.out.println("\nCola con el primer elemento desencolado:\n");
        cola.mostrarCola();
    }
}
