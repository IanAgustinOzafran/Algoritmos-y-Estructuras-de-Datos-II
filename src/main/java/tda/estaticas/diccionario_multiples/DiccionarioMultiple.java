package tda.estaticas.diccionario_multiples;

import tda.estaticas.conjunto.Conjunto;
import tda.estaticas.conjunto.ConjuntoTDA;

public class DiccionarioMultiple implements DiccionarioMultipleTDA {

    private static final int MAX = 100;

    private int[] claves;
    private int[] valores;
    private int cantidad;

    public void InicializarDiccionario() {
        claves = new int[MAX];
        valores = new int[MAX];
        cantidad = 0;
    }

    public void Agregar(int clave, int valor) {
        claves[cantidad] = clave;
        valores[cantidad] = valor;
        cantidad++;
    }

    public void Eliminar(int clave) {
        int i = 0;

        while (i < cantidad) {
            if (claves[i] == clave) {
                claves[i] = claves[cantidad - 1];
                valores[i] = valores[cantidad - 1];
                cantidad--;
            } else {
                i++;
            }
        }
    }

    public void EliminarValor(int clave, int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (claves[i] == clave && valores[i] == valor) {
                claves[i] = claves[cantidad - 1];
                valores[i] = valores[cantidad - 1];
                cantidad--;
                break;
            }
        }
    }

    public ConjuntoTDA Recuperar(int clave) {
        ConjuntoTDA c = new Conjunto();
        c.InicializarConjunto();
        for (int i = 0; i < cantidad; i++) {
            if (claves[i] == clave) {
                c.Agregar(valores[i]);
            }
        }
        return c;
    }

    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new Conjunto();
        c.InicializarConjunto();

        for (int i = 0; i < cantidad; i++) {
            c.Agregar(claves[i]);
        }
        return c;
    }
}

