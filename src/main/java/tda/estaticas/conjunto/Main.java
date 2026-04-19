package tda.estaticas.conjunto;

public class Main {


    public static void main(String[] args) {




        ConjuntoTDA c = new Conjunto();

        c.InicializarConjunto();

        c.Agregar(1);

        c.Agregar(2);

        c.Agregar(3);

        c.Pertenece(3);

        c.Sacar(1);

        System.out.println(c.Pertenece(1));


    }
}
