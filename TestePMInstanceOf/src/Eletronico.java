public final class Eletronico extends Produto{

    private boolean garantia;

    public Eletronico(String name, double preco, boolean garantia) {
        super(name, preco);
        this.garantia = garantia;
    }

    public boolean isGarantia() {
        return garantia;
    }
}
