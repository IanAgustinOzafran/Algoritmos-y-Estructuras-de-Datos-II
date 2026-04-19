package tda.practica.pilas.estrategia2;

public class Pila implements PilaTDA {

    private static final int max = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = new int[max];
        cantidad = 0;
    }

    @Override
    public void Apilar(int x) {
        if (cantidad < max){
            for (int i = cantidad; i > 0; i--){ //mientras i sea igual a la cantidad de elementos y positivo vamos para atras
                datos[i] = datos[i-1]; //mueve los elementos a la derecha
            }

            datos[0] = x; //el nuevo elemento se agrega en la primera posicion
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()){
            for (int i = 0; i < cantidad - 1; i ++){
                datos[i] = datos[i+1]; //mueve los elementos a la izquierda
            }
            cantidad--;
        }
    }

    @Override
    public int Tope() {
        return (datos[0]);
    }

    @Override
    public boolean PilaVacia() {
        return (cantidad == 0);
    }
}
