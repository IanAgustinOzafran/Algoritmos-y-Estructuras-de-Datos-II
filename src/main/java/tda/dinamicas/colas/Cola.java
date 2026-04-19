package tda.dinamicas.colas;

public class Cola implements ColaTDA {

    private Nodo frente;
    private Nodo fin;

    @Override
    public void InicializarCola() {
        frente = null;
        fin = null;
    }

    @Override
    public void Acolar(int x) {
        Nodo nuevo = new Nodo(x, null); //no pregunta nada simplemente crea un nuevo nodo
        nuevo.data = x; // le agrega al nuevo nodo la informacion
        nuevo.next = null; //el nuevo apunta a null

        if (fin != null) { //si el fin no es nulo
            fin.next = nuevo; //entonces el siguiente al fin es el nuevo
        }

        fin = nuevo;

        if (frente == null) {
            frente = nuevo;
        }
    }

    @Override
    public void Desacolar() {
        frente = frente.next;

        if (frente == null) {
            fin = null;
        }
    }

    @Override
    public int Primero() {
        return frente.data;
    }

    @Override
    public boolean ColaVacia() {
        return (frente == null);
    }
}
