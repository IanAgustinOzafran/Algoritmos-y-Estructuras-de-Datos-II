package tda.estaticas.diccionarios;

import tda.estaticas.conjunto.ConjuntoTDA;

public interface DiccionarioTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    int Recuperar(int clave);
    ConjuntoTDA Claves();
}
