package tda.estaticas.diccionario_multiples;

import tda.estaticas.conjunto.ConjuntoTDA;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    void EliminarValor(int clave, int valor);
    ConjuntoTDA Recuperar(int clave);
    ConjuntoTDA Claves();
}
