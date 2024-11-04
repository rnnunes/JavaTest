import java.util.Objects;

public class Produto {

    private String name;
    private double price;

    public Produto(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("O valor nao pode ser menor que 0");
        }
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Produdo{`" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produdo)) return false;
        return Double.compare(price, produdo.price) == 0 && Objects.equals(name, produdo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
