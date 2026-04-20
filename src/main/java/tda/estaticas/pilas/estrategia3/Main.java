package tda.estaticas.pilas.estrategia3;

public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila();

        pila.InicializarPila();

        pila.Apilar(5);

        System.out.println("Se apilo el 5");

        pila.Apilar(12);

        System.out.println("Se apilo el 12");

        pila.Apilar(3);

        System.out.println("Se apilo el 3");


        pila.Apilar(8);

        System.out.println("Se apilo el 8");

        pila.Apilar(1);

        System.out.println("Se apilo el 1");

        System.out.println("Tope de la pila: " + pila.Tope());

        System.out.println("Cantidad de elementos en la pila: " + pila.datos[0]);

        pila.Desapilar();

        pila.Desapilar();

        pila.Apilar(9);

        System.out.println("Se apilo el 9");

        pila.Apilar(6);

        pila.Apilar(5);

        pila.Apilar(4);

        pila.Apilar(3);

        System.out.println("Se apilo el 6");

        System.out.println("Tope de la pila: " + pila.Tope());

        System.out.println("Cantidad de elementos en la pila: " + pila.datos[0]);



    }
}
