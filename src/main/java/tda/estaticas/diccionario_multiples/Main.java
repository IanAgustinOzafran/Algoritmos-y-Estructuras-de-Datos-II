package tda.estaticas.diccionario_multiples;

import tda.estaticas.conjunto.ConjuntoTDA;

import static tda.estaticas.conjunto.Conjunto.mostrarConjunto;

public class Main {

    public static void main(String[] args) {

        DiccionarioMultiple diccionario = new DiccionarioMultiple();

        diccionario.InicializarDiccionario();

        diccionario.Agregar(2, 5);

        diccionario.Agregar(3, 4);

        diccionario.Claves();

        diccionario.EliminarValor(2, 3);

        System.out.println(diccionario.Recuperar(2)); //Esto solo, esta mal

        ConjuntoTDA resultado = diccionario.Recuperar(2); //Esto es correcto

        ConjuntoTDA resultado2 = diccionario.Recuperar(3); //Esto es correcto

        mostrarConjunto(resultado);

        mostrarConjunto(resultado2);
    }
}
