import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Produto p1 = new Produto("TV", 2100.00);
        Produto p2 = new Produto("Gelardeira", 1800.00);
        Produto p3 = new Produto("Computer", 3000.00);
        Produto p4 = new Produto("Computer", 3000.00);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println(lista.contains(p4));
        System.out.println(lista.indexOf(p4));

        System.out.println(p3);
        System.out.println(p4);

        if (p3.equals(p4)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

    }

}
