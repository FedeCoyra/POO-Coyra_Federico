package ar.edu.unlu.poo.ejercicio4;

public class Cola {
    private Nodo frenteCola = null;
    private Nodo finalCola = null;

    public void crearCola() {
        frenteCola = null;
        finalCola = null;
    }

    public boolean colaVacia() {
        return (frenteCola == null);
    }

    public void encolarElemento(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (colaVacia()) {
            frenteCola = nuevoNodo;
            finalCola = nuevoNodo;
        }
        else{
            finalCola.setSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
    }

    public Object desencolarElemento() {

        if (colaVacia()) {
            return null;
        }

        Nodo nodoActual = frenteCola;
        Object dato = frenteCola.getDato();
        frenteCola = nodoActual.getSiguiente();

        return dato;
    }

    public void mostrarCola(){

        if (colaVacia()){
            System.out.println("La cola esta vacia.");
            return;
        }

        Cola colaAuxiliar = new Cola();
        Object datos = desencolarElemento();
        System.out.println("CONTENIDO DE LA COLA:");
        int posiciones=0;

        while (datos != null){
            posiciones++;
            System.out.printf("Item %d: %s\n", posiciones, datos);
            colaAuxiliar.encolarElemento(datos);
            datos = desencolarElemento();
        }

        System.out.println("\n");

        while (!colaAuxiliar.colaVacia()){
            encolarElemento(colaAuxiliar.desencolarElemento());
        }
    }

    public Object recuperarFrente(){
        if (colaVacia()){
            return null;
        }
        return frenteCola.getDato();
    }

    public Object recuperarFinal(){
        if (colaVacia()){
            return null;
        }
        return finalCola.getDato();
    }

}