package tda.practica.pilas.estrategia1;

public class Pila implements PilaTDA {

    private static int max = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = new int[max];
        cantidad = 0;
    }

    @Override
    public void Apilar(int x) {
        if (cantidad < max) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()){
            cantidad--;
        }
    }

    @Override
    public int Tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return (cantidad == 0);
    }
}
