public class TesteSaldoInsuficienteExceptions {
    public static void main(String[] args) {

        Conta conta = new Conta(9910, 9824,new Cliente("Pedro", 123456789));
        conta.depositar(500);
        conta.sacar(780);

        System.out.println(conta.getSaldo());

    }
}
