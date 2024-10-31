import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListOrdenacao {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Marcelo");
        nomes.add("Vanessa");


        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("%dº Nome: %s%n", i + 1, nomes.get(i));
        }

        Collections.sort(nomes);
        System.out.println();

        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println();
        System.out.println("*************************************************************************************************");
        System.out.println();

        ArrayList<Produto> produto = new ArrayList();
        Produto p1 = new Produto("TV", 2100.00);
        Produto p2 = new Produto("Geladeira", 1800.00);
        Produto p3 = new Produto("Computer", 3000.00);
        Produto p4 = new Produto("Armario", 1200.00);

        produto.add(p1);
        produto.add(p2);
        produto.add(p3);
        produto.add(p4);

       // Collections.sort(produto);
          Collections.sort(produto, new PrecoProdutoComparator());

        for (Produto produtos: produto) {
            System.out.println("Produto: " + produtos.getNome() + ", Preço: " + produtos.getPreco() );
        }

    }

}

class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {

        return (int) (p1.getPreco() - p2.getPreco());
    }
}