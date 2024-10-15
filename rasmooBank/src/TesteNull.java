public class TesteNull {
    public static void main(String[] args) {

        Conta conta = new Conta();

        System.out.println(conta.agencia);
        System.out.println(conta.id_conta);
        System.out.println(conta.saldo);

        conta.titular = new Cliente();
        conta.titular.nome = "Rian";

        System.out.println(conta.titular.nome);
    }
}
