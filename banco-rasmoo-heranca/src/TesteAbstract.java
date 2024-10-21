public class TesteAbstract {

    public static void main(String[] args) {

        Cliente teste1 = new Cliente("Rian", 123456789);

        ContaCorrente cc = new ContaCorrente(1678, 0014, teste1);
        ContaPoupanca cp = new ContaPoupanca(1678, 0014, teste1);

        cc.gerarExtrato();
        cp.gerarExtrato();

    }

}
