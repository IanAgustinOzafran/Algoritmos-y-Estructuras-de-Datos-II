package tda.estaticas.pilas.estrategia1;

public class Pila implements PilaTDA  {

    private static final int MAX = 3;
    private int[] datos;
    private int cantidad;

    public void InicializarPila() {
        datos = new int[MAX];
        cantidad = 0;
    }

    public void Apilar(int x) {
        if (cantidad < MAX) {
            datos[cantidad] = x; //la guarda al final
            cantidad++;
        }
    }

    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    public int Tope() {
        return datos[cantidad - 1]; //devuelve el ultimo elemento de la lista
    }

    public boolean PilaVacia(){
        return cantidad == 0;
    }
}
