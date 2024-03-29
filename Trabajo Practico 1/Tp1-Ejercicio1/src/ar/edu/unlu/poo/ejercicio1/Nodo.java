package ar.edu.unlu.poo.ejercicio1;

public class Nodo {
    private Object dato;
    private Nodo siguiente = null;

    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
