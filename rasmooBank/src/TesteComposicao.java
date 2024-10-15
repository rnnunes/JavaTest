public class TesteComposicao {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.nome  = "Rian";
        cliente1.cpf = 12345678;
        cliente1.profissao = "Garoto de Programa";
        cliente1.salario = 3000.00;

        Conta conta = new Conta();
        conta.titular = cliente1;

        System.out.println(conta.titular.nome);


    }
}
