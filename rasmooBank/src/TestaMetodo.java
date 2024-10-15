public class TestaMetodo {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.depositar(200.00);
        conta.depositar(500.00);

        conta.sacar(500.00);

        System.out.println();
        System.out.println("Saldo Atual: " + conta.saldo);
        System.out.println("****************************************");

        conta.sacar(200.00);

        System.out.println();
        System.out.println("Saldo Atual: " + conta.saldo);
        System.out.println("****************************************");
    }
}
