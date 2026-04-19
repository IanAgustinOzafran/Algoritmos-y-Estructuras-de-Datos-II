package tda.estaticas.diccionarios;

public class Main {

    public static void main(String[] args) {


        DiccionarioTDA dic = new Diccionario();

        dic.InicializarDiccionario();

        dic.Agregar(1, 3);

        dic.Agregar(2, 4);

        dic.Agregar(3, 5);

        dic.Agregar(4, 6);

    }
}
