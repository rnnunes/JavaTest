public class TesteConstrutor {
    public static void main(String[] args) {

        Conta conta = new Conta(2370,10025, new Cliente());

        System.out.println(conta.getAgencia());
        System.out.println(conta.getId_conta());
        System.out.println(conta.getTitular());

    }
}
