package tda.estaticas.colas;

public interface ColaTDA {
    void InicializarCola();
    void Acolar(int x);
    void Desacolar();
    int Primero();
    boolean ColaVacia();
}
