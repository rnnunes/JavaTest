public class TesteAbstract {

    public static void main(String[] args) {

        Cliente teste1 = new Cliente("Rian", 123456789);
        ContaCorrente conta = new ContaCorrente(1678, 0014, teste1);

    }

}
