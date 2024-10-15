public class EstruturaRepeticao {
    public static void main(String[] args) {

        int cont = 0;

        while (cont <= 20) {
            System.out.printf("Contando: %d %n", cont);
            cont += 1;
        }

        System.out.println("************************************************");

        for (int i = 0; i <= 20; i++) {
            System.out.println("Numero: " + i);
        }

        System.out.println("************************************************");

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


    }
}
