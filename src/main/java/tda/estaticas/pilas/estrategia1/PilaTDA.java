package tda.estaticas.pilas.estrategia1;

public interface PilaTDA {
    void InicializarPila();
    void Apilar(int x);
    void Desapilar();
    int Tope();
    boolean PilaVacia();
}
