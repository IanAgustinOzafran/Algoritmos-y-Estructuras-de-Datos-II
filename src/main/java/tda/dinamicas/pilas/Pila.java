package tda.dinamicas.pilas;

public class Pila implements PilaTDA {

    private Nodo tope;

    @Override
    public void InicializarPila() {
        tope = null;
    }

    @Override
    public void Apilar(int x) {
        Nodo nodo = new Nodo(x, tope);
        tope = nodo;
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            tope = tope.getNext();
        }
    }

    @Override
    public int Tope(){
        return tope.getData();
    }

    @Override
    public boolean PilaVacia() {
        return tope==null;
    }


}
