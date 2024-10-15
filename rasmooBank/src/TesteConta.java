
public class TesteConta {
    public static void main(String[] args) {

        Conta firstConta = new Conta();

        firstConta.id_conta = 0001;
        firstConta.agencia = 03;
        //firstConta.titular = "R.Nunes";
        firstConta.saldo = 2000.00;

        System.out.printf("Titular: %s%n", firstConta.titular);
        System.out.printf("Agencia: %d - Numero: %d%n", firstConta.agencia, firstConta.id_conta);
        System.out.printf("Saldo: %.2f.",firstConta.saldo);
    }
}
