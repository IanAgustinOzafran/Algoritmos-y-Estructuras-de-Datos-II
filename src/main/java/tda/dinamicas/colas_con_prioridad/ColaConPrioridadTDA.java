package tda.dinamicas.colas_con_prioridad;

public interface ColaConPrioridadTDA {
    void InicializarCola();
    void AcolarPrioridad(int x, int prioridad);
    void Desacolar();
    int Primero();
    int Prioridad();
    boolean ColaVacia();
}
