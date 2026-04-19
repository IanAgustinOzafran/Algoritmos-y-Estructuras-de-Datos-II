package tda.estaticas.colas_con_prioridad;

public class ColaConPrioridad implements ColaConPrioridadTDA {

    private static final int MAX = 100;

    private int[] valores;
    private int[] prioridades;
    private int cantidad;

    public void InicializarCola() {
        valores = new int[MAX];
        prioridades = new int[MAX];
        cantidad = 0;
    }

    public void AcolarPrioridad(int x, int prioridad) {
        valores[cantidad] = x;
        prioridades[cantidad] = prioridad;
        cantidad++;
    }

    public void Desacolar() {

        int posMax = 0;

        for (int i = 1; i < cantidad; i++) {
            if (prioridades[i] > prioridades[posMax]) {
                posMax = i;
            }
        }

        valores[posMax] = valores[cantidad - 1];
        prioridades[posMax] = prioridades[cantidad - 1];
        cantidad--;
    }

    public int Primero() {

        int posMax = 0;

        for (int i = 1; i < cantidad; i++) {
            if (prioridades[i] > prioridades[posMax]) {
                posMax = i;
            }
        }

        return valores[posMax];
    }

    public boolean ColaVacia() {
        return cantidad == 0;
    }

}
