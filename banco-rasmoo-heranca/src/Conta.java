public abstract class Conta {

        //atributos de classe

        private int agencia;
        private int id_conta;
        private Cliente titular;
        private double saldo;
        private static int total;

        //contrutores
        public Conta () {

        }

        public Conta (int agencia, int id_conta, Cliente titular) {
                this.agencia = agencia;
                this.id_conta = id_conta;
                this.titular = titular;
                Conta.total++;

        }

        //metodos da classe
        public void depositar (double valor) {
                this.saldo += valor;
        }

        public boolean sacar(double valor) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                       // System.out.printf("O Saque foi Realizado com Sucesso!");
                        return true;
                } else {
                      // System.out.printf("Você não tem Saldo o suficiente!");
                        return false;
                }
        }

        public void transfer(double valor, Conta destino ) {
                boolean conseguiuSacar = this.sacar(valor);

                if (conseguiuSacar) {
                        destino.depositar(valor);
                }
        }

        public abstract void gerarExtrato();


        //encapsulamento-:Getters-Setters

        public int getAgencia() {
                return this.agencia;
        }

        public void setAgencia(int agencia) {
                if (agencia > 0) {
                        this.agencia = agencia;
                }
        }

        public  int getId_conta() {
                return this.id_conta;
        }

        public void setId_conta(int id_conta) {
                this.id_conta = id_conta;
        }

        public Cliente getTitular() {
                return this.titular;
        }

        public void setTitular (Cliente cliente) {
                this.titular = cliente;
        }

        public double getSaldo() {
                return this.saldo;
        }

        public static int getTotal() {
                return Conta.total;
        }

        @Override
        public String toString() {
                return "Conta{" +
                        "agencia =" + agencia +
                        ", id_conta = " + id_conta +
                        ", titular = " + titular +
                        ", saldo = " + saldo +
                        '}';
        }
}
