package tda.dinamicas.colas_con_prioridad;

public class ColaConPrioridad implements ColaConPrioridadTDA {

    private Nodo frente;

    @Override
    public void InicializarCola() {
        frente = null;
    }

    @Override
    public void AcolarPrioridad(int numero, int prioridad) {
        Nodo nuevo = new Nodo(numero, prioridad, null);

        if (frente == null || prioridad > frente.getPrioridad()) {
            // Insertar al frente si la lista está vacía o tiene mayor prioridad.
            nuevo.setNext(frente);
            frente = nuevo;
        } else {
            // Avanzar hasta encontrar el lugar correcto (orden descendente de prioridad).
            Nodo curr = frente;
            while (curr.getNext() != null && curr.getNext().getPrioridad() >= prioridad) {
                curr = curr.getNext();
            }
            nuevo.setNext(curr.getNext());
            curr.setNext(nuevo);
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            frente = frente.getNext();
        }
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }

    @Override
    public int Primero() {
        return frente.getData();
    }

    @Override
    public int Prioridad() {
        return frente.getPrioridad();
    }
}
