package tda.estaticas.diccionarios;

import tda.estaticas.conjunto.Conjunto;
import tda.estaticas.conjunto.ConjuntoTDA;

public class Diccionario implements DiccionarioTDA {

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
        int pos = -1;

        for (int i = 0; i < cantidad; i++) {
            if (claves[i] == clave) {
                pos = i;
            }
        }

        if (pos == -1) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        } else {
            valores[pos] = valor;
        }
    }

    public void Eliminar(int clave) {
        int pos = -1;

        for (int i = 0; i < cantidad; i++) {
            if (claves[i] == clave) {
                pos = i;
            }
        }

        if (pos != -1) {
            claves[pos] = claves[cantidad - 1];
            valores[pos] = valores[cantidad - 1];
            cantidad--;
        }
    }

    public int Recuperar(int clave) {
        for (int i = 0; i < cantidad; i++) {
            if (claves[i] == clave) {
                return valores[i];
            }
        }
        return 0;
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
