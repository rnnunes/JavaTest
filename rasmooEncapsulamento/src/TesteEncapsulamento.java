
 class TesteEncapsulamento {
    public static void main(String[] args) {

        //contrutores
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        conta.depositar(1000);
        conta.sacar(500);

        cliente.setNome("Rian");
        cliente.setCpf(12345678);
        cliente.setProfissao("Dev Java");
        cliente.setSalario(10000.00);

        conta.setTitular(cliente);

        System.out.println();
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getProfissao());
        System.out.println("Saldo Atual: " + conta.getSaldo());
    }
}
