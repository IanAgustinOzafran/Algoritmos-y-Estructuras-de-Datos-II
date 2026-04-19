package tda.practica.conjunto;

public interface ConjuntoTDA {

    void InicializarConjunto();
    void Agregar (int x);
    void Sacar (int x);
    boolean Pertenece(int x);
    boolean ConjuntoVacio();
    int Elegir();
}
