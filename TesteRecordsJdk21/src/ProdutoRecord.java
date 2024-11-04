

public record ProdutoRecord(String name, double price) {

    public ProdutoRecord{
        if (price < 0) {
            throw new IllegalArgumentException("O valor nao pode ser menor que 0");
        }
    }

}
