package ar.edu.unlu.poo.ejercicio1;

public class Main {

    public static void main(String[] argumentos){
        Lista nuevaLista = new Lista();

        if (nuevaLista.listaVacia()){
            System.out.println("La lista esta vacia, inserte elementos.\n");
        }

        nuevaLista.addElemento(11);
        nuevaLista.addElemento(15);
        nuevaLista.addElemento(17);
        nuevaLista.addElemento(19);
        nuevaLista.addElemento(20);

        //System.out.println("Lista antes de eliminar:\n");
        nuevaLista.mostrarLista();

        if (!nuevaLista.listaVacia()){
            System.out.println("La lista NO esta vacia.\n");
        }

        nuevaLista.eliminarElemento(3);

        System.out.println("Eliminar el elemento de la 3ra posicion:\n");
        nuevaLista.mostrarLista();

        System.out.printf("La longitud de la lista es de %d elementos\n", nuevaLista.listaLargo());

        System.out.printf("Recupero el tercer elemento: %s\n", nuevaLista.recuperarElemento(3));

        System.out.println("Insertar un elemento en la 3ra posicion:\n");
        nuevaLista.insertarElemento(110,3);
        nuevaLista.mostrarLista();
    }
}
