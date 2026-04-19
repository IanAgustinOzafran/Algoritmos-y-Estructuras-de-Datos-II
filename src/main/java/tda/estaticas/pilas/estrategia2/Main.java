package tda.estaticas.pilas.estrategia2;

public class Main {
    public static void main(String[] args) {
        PilaTDA p1 = new Pila();

        p1.Apilar(4);
        p1.Apilar(5);
        p1.Apilar(6);
        p1.Apilar(7);
        p1.Apilar(8);
        System.out.println(p1.Tope());
    }
}
