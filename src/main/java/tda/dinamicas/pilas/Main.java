package tda.dinamicas.pilas;

public class Main {

    public static void main(String[] args) {

        PilaTDA pila = new Pila();

        pila.Apilar(1);

        pila.Apilar(2);

        pila.Apilar(3);

        System.out.println(pila.Tope());

    }
}