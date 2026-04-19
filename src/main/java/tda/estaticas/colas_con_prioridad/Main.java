package tda.estaticas.colas_con_prioridad;

public class Main {


    public static void main(String[] args) {

        ColaConPrioridad cola = new ColaConPrioridad();

        cola.InicializarCola();

        cola.AcolarPrioridad(7, 2);

        cola.AcolarPrioridad(8, 3);

        cola.Desacolar();

        cola.AcolarPrioridad(8, 3);

        System.out.println(cola.Primero());

        System.out.println(cola.ColaVacia());

    }
}
