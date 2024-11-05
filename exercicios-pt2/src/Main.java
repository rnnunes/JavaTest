import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;

        while (true) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }

            Queue<Integer> pilha = new LinkedList<>();
            StringBuilder descartadas = new StringBuilder();

            for (int i = 1; i < n + 1; i++) {
                pilha.add(i);
        }

        while (pilha.size() > 1) {

            descartadas.append(pilha.remove());

            int cartaFinal = pilha.poll();
            pilha.add(cartaFinal);

            if (pilha.size() > 1) {
                descartadas.append(", ");
            }

        }

        System.out.println("Discarded cards: " + descartadas);
        System.out.println("Remaining card: " + pilha.peek());

        }

        sc.close();
    }

}