package tda.dinamicas.conjuntos;

public class Conjunto implements ConjuntoTDA {

    class Nodo {
        int info;
        Nodo sig;
    }

    Nodo origen;

    @Override
    public void InicializarConjunto() {
        origen = null;
    }

    @Override
    public void Agregar(int x) {
        if (!Pertenece(x)) {
            Nodo nuevo = new Nodo();
            nuevo.info = x;
            nuevo.sig = origen;
            origen = nuevo;
        }
    }

    @Override
    public void Sacar(int x) {
        if (origen != null) {

            if (origen.info == x) {
                origen = origen.sig;
            } else {
                Nodo aux = origen;

                while (aux.sig != null && aux.sig.info != x) {
                    aux = aux.sig;
                }

                if (aux.sig != null) {
                    aux.sig = aux.sig.sig;
                }
            }
        }
    }

    @Override
    public int Elegir() {
        return origen.info;
    }

    @Override
    public boolean Pertenece(int x) {
        Nodo aux = origen;

        while (aux != null) {
            if (aux.info == x) {
                return true;
            }
            aux = aux.sig;
        }

        return false;
    }

    @Override
    public boolean ConjuntoVacio() {
        return origen == null;
    }
}