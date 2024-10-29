public class TesteArrayReferencia {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];
        produtos[0] = new Produto("Computer I7", 5500.90);
        produtos[1] = new Produto("Galaxy A60", 4000.00);

        try {
            for (int i = 0; i < produtos.length; i ++) {
                System.out.println("Produto: " + produtos[i].getNome() +
                                    " Valor: " + produtos[i].getPreco());
            }
        } catch (RuntimeException ex) {
            System.out.println("O erro foi: " + ex.getMessage());
        }

//try {
//    System.out.println(produtos[10]);
//} catch (ArrayIndexOutOfBoundsException ex) {
//    System.out.println("Erro: " + ex);
//}
    }

}
