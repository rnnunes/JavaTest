public class TesteStatic {
    public static void main(String[] args) {

        Cliente teste1 = new Cliente("Rian", 12345864);
        Conta conta1 = new Conta(4000, 10001, teste1);
        Conta conta2 = new Conta(5000, 10002, teste1);
        Conta conta3 = new Conta(6000, 10003, teste1);

        System.out.println("Total: " + Conta.getTotal());

    }
}
