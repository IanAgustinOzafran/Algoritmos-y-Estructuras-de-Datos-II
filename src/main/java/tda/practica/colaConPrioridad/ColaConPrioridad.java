package tda.practica.colaConPrioridad;

public class ColaConPrioridad implements ColaConPrioridadTDA {

    private static final int max = 100;
    private int[] datos;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void InicializarColaConPrioridad() {
        datos = new int[max];
        prioridades = new int[max];
        cantidad = 0;
    }

    @Override
    public void Acolar(int x, int prioridad) {
        if (cantidad < max){ // 1. Verificamos si hay espacio
            int i = cantidad - 1; // 2. Empezamos desde el último elemento

            // 3. Buscamos el lugar: desplazamos mientras el nuevo sea más importante
            while (i>=0 && prioridades[i] < prioridad){

                datos[i+1] = datos[i]; // Desplaza el dato a la derecha
                prioridades[i+1] = prioridades[i]; // Desplaza la prioridad a la derecha
                i--; // Seguimos mirando hacia la izquierda
            }

            // 4. Ubicamos el nuevo elemento en el "hueco" que quedó
            datos[i + 1] = x;
            prioridades[i + 1] = prioridad;

            // 5. Registramos que ahora hay un elemento más
            cantidad++;
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()){

            for (int i=0; i<cantidad; i++){

                datos[i +1] = datos[i];
                prioridades[i +1] = prioridades[i];
            }
            cantidad--;
        }
    }

    @Override
    public int Primero() {
        return (datos[0]);
    }

    @Override
    public int Prioridad() {
        return (prioridades[0]);
    }

    @Override
    public boolean ColaVacia() {
        return (cantidad == 0);
    }
}
