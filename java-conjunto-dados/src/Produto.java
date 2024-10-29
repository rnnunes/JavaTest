public class Produto implements Comparable<Produto>{

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals (Object ref) {
        Produto produto = (Produto) ref;
        if (this.nome != produto.getNome()) {
            return false;
        }

        return true;
    }

    //public Comparable

}
