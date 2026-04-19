package tda.estaticas.colas;

public class Cola implements ColaTDA {

    private static final int MAX = 100;
    private int []datos;
    private int cantidad;

    public void InicializarCola(){
        datos = new int[MAX];
        cantidad = 0;
    }

    public void Acolar(int x){
        datos[cantidad] = x;
        cantidad++;
    }

    public void Desacolar(){ //movemos todos los valores a la izquierda y decrementamos cantidad
        if (!ColaVacia()){
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i+1];
            }
            cantidad--;
        }
    }

    public int Primero() { //devuelve el primer elemento de la cola
        return datos[0];
    }

    public boolean ColaVacia(){
        return cantidad == 0;
    }

}
