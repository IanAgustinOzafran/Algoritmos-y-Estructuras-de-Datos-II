package tda.practica.colaConPrioridad;

public interface ColaConPrioridadTDA {

    void InicializarColaConPrioridad();
    void Acolar (int x, int prioridad);
    void Desacolar();
    int Primero();
    int Prioridad();
    boolean ColaVacia();

}
