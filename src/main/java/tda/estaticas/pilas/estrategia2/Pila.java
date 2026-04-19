package tda.estaticas.pilas.estrategia2;

public class Pila implements PilaTDA {

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    public void InicializarPila() {
        datos = new int[MAX];
        cantidad = 0;
    }

    public void Apilar(int x) {
        if (cantidad < MAX) {
            for (int i = cantidad; i > 0; i--) {
                datos[i] = datos[i - 1]; // mueve a la derecha
            }
            datos[0] = x; // el tope siempre queda en 0
            cantidad++;
        }
    }

    public void Desapilar() {
        if (!PilaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1]; // corre a la izquierda
            }
            cantidad--;
        }
    }

    public int Tope() {
        return datos[0];
    }

    public boolean PilaVacia() {
        return cantidad == 0;
    }

}
