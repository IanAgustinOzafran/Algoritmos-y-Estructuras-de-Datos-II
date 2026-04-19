package tda.dinamicas.colas;

public class Nodo {

    public int data;
    public Nodo next;

    public Nodo(int data, Nodo next) {
        this.data = data;
        this.next = next;
    }

    public int getData() { //Devuelve el valor del elemento que esta arriba, no la posicion
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getNext() { //Es crucial para desapilar un elemento de la pila
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
