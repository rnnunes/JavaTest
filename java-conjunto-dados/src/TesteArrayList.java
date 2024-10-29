import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList();
        ArrayList<String> names = new ArrayList();

        Produto p1 = new Produto("TV", 2100.00);
        Produto p2 = new Produto("Gelardeira", 1800.00);
        Produto p3 = new Produto("Computer", 3000.00);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Produto tv = lista.get(0);
        System.out.println(tv.getNome());

        lista.remove(2);
        //lista.clear();

        System.out.println("Tamanho: " + lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista);



    }

}
