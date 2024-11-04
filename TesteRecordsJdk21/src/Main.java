public class Main {
    public static void main(String[] args) {

        var p1 = new ProdutoRecord("Iphone 0", -5);
        var p2 = new Produto("Iphone 0",  1);

        System.out.println(p1.name());
        System.out.println(p1.price());

        System.out.println(p1);
        System.out.println(p2);
       // System.out.println(p1.equals(p2));
    }
}