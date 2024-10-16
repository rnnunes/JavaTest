public class Cliente {

    //atributos de classe

    private String nome;
    private String profissao;
    private int cpf;
    private double salario;

    //construtor
    public Cliente() {

    }

    public Cliente(String nome, int cpf) {
        this.nome = nome;
    }

    //encapsulamento-:Getters-Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
