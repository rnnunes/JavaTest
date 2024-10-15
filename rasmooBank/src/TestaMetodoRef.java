public class TestaMetodoRef {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000.00);
        primeiraConta.transfer(500.00, segundaConta);
        primeiraConta.transfer(250.00, segundaConta);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

    }
}
