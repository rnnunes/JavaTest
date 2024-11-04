public sealed class Produto permits Eletronico, Alimento{

    private String name;
    private double preco;


    public Produto(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }
}
