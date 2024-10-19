public class TestePolimorfismo {

    public static void main(String[] args) {

        Cliente teste1 = new Cliente("Rian", 12345678);
        ContaCorrente cc = new ContaCorrente(12005, 0012, teste1);
        ContaPoupanca cp = new ContaPoupanca(12005, 0013, teste1);

        cc.depositar(1000);
        cp.depositar(10000);

        cc.sacar(100);
        cp.sacar(1000);

        cp.transfer(500, cc);
        cc.transfer(100, cp);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        System.out.println(cc);
        System.out.println(cp);
    }
}

