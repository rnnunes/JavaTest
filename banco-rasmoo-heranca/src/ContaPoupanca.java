public class ContaPoupanca extends Conta{

    public ContaPoupanca (int agencia, int id_conta, Cliente titular) {
        super(agencia, id_conta, titular);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para Conta Poupança.");
    }
}
