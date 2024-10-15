public class TesteConstrutor {
    public static void main(String[] args) {

        Cliente teste = new Cliente("Rian", 123456789);
        Conta conta = new Conta(2370,10025, teste);

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getId_conta());


    }
}
