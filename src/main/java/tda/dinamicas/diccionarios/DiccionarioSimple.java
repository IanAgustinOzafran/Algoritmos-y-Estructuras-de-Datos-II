package tda.dinamicas.diccionarios;

import tda.estaticas.conjunto.ConjuntoTDA;

public class DiccionarioSimple implements DiccionarioTDA {

    private Nodo cabeza;

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(int clave, int valor) {

        Nodo curr = new Nodo(clave, valor, null);


        while (curr != null && curr.getClave() != clave){
            curr = curr.getNext();
        }

        //si la clave no esta la tiene que agregar

        //si la clave no es null, es decir esta en el diccionario le cambia el valor
        if (curr != null) {
            curr.setData(valor);
        } else {
            //si la clave es null, es decir no esta crea un nuevo nodo y la agrega
            cabeza = new Nodo(clave, valor, cabeza);
        }

    }

    @Override
    public void Eliminar(int clave) {

    }

    @Override
    public int Recuperar(int clave) {
        return 0;
    }

    @Override
    public ConjuntoTDA Claves() {
        return null;
    }
}
