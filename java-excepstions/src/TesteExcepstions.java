import exception.SaldoInsuficienteException;

public class TesteExcepstions {

    public static void main(String[] args) {

        try {

            int resultado = 5/2;
            System.out.println("O Resultado da divisão é: " + resultado);

            Cliente cliente = new Cliente("Pedro",1235518963);
            Conta conta = new Conta(3245, 8732, cliente);
            conta.depositar(1000);
            conta.sacar(1100);
            System.out.println("Saldo: " + conta.getSaldo());

        } catch (SaldoInsuficienteException ex) {
            System.out.println("O motivo do erro foi: " + ex.getMessage());
        } finally {
            System.out.println("This block always execute");
        }
        System.out.println("Opa! agr sou chamado!");

    }

}
