import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num_incial = 0;
        do {
            num_incial = sc.nextInt();
        }
        while (num_incial < 0 || num_incial >= Math.pow(10,5));

        //***************************************************************

        ArrayList<Integer> valores = new ArrayList<>();

        for (int i = 0; i < num_incial; i++) {
            valores.add(sc.nextInt());
        }

        Collections.sort(valores);
        for (Integer valor: valores) {
            if (valor % 2 == 0) {
                System.out.println(valor);
            }
        }

        Collections.sort(valores, Collections.reverseOrder());
        for (Integer valor: valores) {
            if (valor % 2 == 1) {
                System.out.println(valor);
            }
        }

        sc.close();
    }
}