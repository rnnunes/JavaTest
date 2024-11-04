import java.time.LocalDate;

public final class Alimento extends Produto {

    private LocalDate dataValidade;

    public Alimento(String name, double preco, LocalDate dataValidade) {
        super(name, preco);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
}
