package tda.practica.cola;

public class Cola implements ColaTDA {

    private static final int max = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void InicializarCola() {
        datos = new int[max];
        cantidad = 0;
    }

    @Override
    public void Acolar(int x) {
        if (cantidad < max){
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()){
            for (int i = 0; cantidad < max; i ++){
                datos[i] = datos[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public int Primero() {
        return (datos[0]);
    }

    @Override
    public boolean ColaVacia() {
        return (cantidad == 0);
    }
}
