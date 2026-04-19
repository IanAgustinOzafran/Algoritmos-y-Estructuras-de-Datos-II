package tda.practica.pilas.estrategia3;

public class Pila implements  PilaTDA {

    private static final int max = 100;
    private int[] datos;


    @Override
    public void InicializarPila() {
        datos = new int[max + 1];
        datos[0] = 0;
    }

    @Override
    public void Apilar(int x) {
        if (datos[0] < max){
            datos[0]++;
            datos[datos[0]] = x;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()){
            datos[0]--;
        }
    }

    @Override
    public int Tope() {
        return datos[datos[0]];
    }

    @Override
    public boolean PilaVacia() {
        return (datos[0] == 0);
    }
}
