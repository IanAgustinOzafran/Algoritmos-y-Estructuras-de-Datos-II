package tda.dinamicas.colas_con_prioridad;

public class Nodo {

    private int data;
    private int prioridad;
    private Nodo next;

    public Nodo(int data, int prioridad, Nodo next) {
        this.data = data;
        this.prioridad = prioridad;
        this.next = next;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
