package tda.estaticas.pilas.estrategia2;

public interface PilaTDA {
    void InicializarPila();
    void Apilar(int x);
    void Desapilar();
    int Tope();
    boolean PilaVacia();
}
