public class TesteHeranca {
    public static void main(String[] args) {

        Cliente teste = new Cliente("Rian", 1234567);
        ContaCorrente cc = new ContaCorrente(1001, 100, teste);

        cc.depositar(1000);
       // cc.sacar(500);


        ContaPoupanca cp = new ContaPoupanca(1298, 488, teste);

        cc.transfer(200, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
