package ar.edu.unlu.poo.ejercicio3;

public class Main {
    public static void main(String[] args){

        Pila pila = new Pila();

        if(pila.pilaVacia()){
            System.out.println("La pila esta vacia, inserte elementos.\n");
        }
        System.out.println("Cargando valores en la pila\n");

        pila.apilarElemento(3);
        pila.apilarElemento(5);
        pila.apilarElemento(7);
        pila.apilarElemento(9);
        pila.apilarElemento(11);

        pila.mostrarPila();

        if (!pila.pilaVacia()){
            System.out.println("La pila ya no está vacía.\n");
        }

        System.out.printf("Tope de la pila, elemento: %s\n\n", pila.devolverTope());

        System.out.println("Muestro la pila para mostrar que no se perdio al mostrar el tope:\n");
        pila.mostrarPila();

        pila.desapilarElemento();
        System.out.println("Pila con el elemento desapilado: ");
        pila.mostrarPila();
    }
}
