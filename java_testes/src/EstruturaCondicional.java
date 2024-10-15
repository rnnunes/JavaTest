public class EstruturaCondicional {
    public static void main(String[] args) {
        double media = 10;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5){
            System.out.println("Recuração");
        } else {
            System.out.println("Reprovado");
        }

        // -------------------------------

        int mes = 1;
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            default:
                System.out.println("Mes Invalido");
        }

     }
}
