package tda.dinamicas.diccionarios;

public class Nodo {

    private int data;
    private int clave;
    private Nodo next;

    public Nodo (int data, int clave, Nodo next){
        this.data = data;
        this.clave = clave;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
