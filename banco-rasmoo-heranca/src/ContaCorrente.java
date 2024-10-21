public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int id_conta, Cliente titular) {
        super(agencia, id_conta, titular);
    }

    //metodos / Polimorfismo

    @Override
    public boolean sacar(double valor) {
        double novoValor = valor + 5;
        return super.sacar(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para Conta Corrente.");
    }
}
