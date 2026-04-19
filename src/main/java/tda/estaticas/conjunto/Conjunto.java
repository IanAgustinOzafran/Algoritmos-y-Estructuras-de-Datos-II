package tda.estaticas.conjunto;

public class Conjunto implements ConjuntoTDA {

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    public void InicializarConjunto() {
        datos = new int[MAX];
        cantidad = 0;
    }

    public void Agregar(int x) {
        if (!Pertenece(x) && cantidad < MAX) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    public void Sacar(int x) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == x) {
                datos[i] = datos[cantidad - 1];
                cantidad--;
                break;
            }
        }
    }

    public boolean Pertenece(int x) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == x) {
                return true;
            }
        }
        return false;
    }

    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    public int Elegir() {
        return datos[cantidad - 1];
    }

    public static void mostrarConjunto(ConjuntoTDA c) {

        ConjuntoTDA aux = new Conjunto();
        aux.InicializarConjunto();

        while (!c.ConjuntoVacio()) {
            int x = c.Elegir();
            System.out.println(x);

            aux.Agregar(x);
            c.Sacar(x);
        }

        // restaurar el conjunto original
        while (!aux.ConjuntoVacio()) {
            int x = aux.Elegir();
            c.Agregar(x);
            aux.Sacar(x);
        }
    }
}