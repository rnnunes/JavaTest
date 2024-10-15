public class Conta {

        int agencia;
        int id_conta;
        Cliente titular;
        double saldo;


        void depositar (double valor) {
                saldo += valor;
        }
        boolean sacar(double valor) {
                if (saldo >= valor) {
                        saldo -= valor;
                        System.out.printf("O Saque foi Realizado com Sucesso!");
                        return true;
                } else {
                        System.out.printf("Você não tem Saldo o suficiente!");
                        return false;
                }
        }

        void transfer(double valor, Conta destino ) {
                boolean conseguiuSacar = this.sacar(valor);

                if (conseguiuSacar) {
                        destino.depositar(valor);
                }
        }


}
