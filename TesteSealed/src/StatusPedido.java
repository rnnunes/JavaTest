public sealed class StatusPedido permits Pendente, Processando, Enviado, Entregue{

    private String descricao;

    public StatusPedido(String descricao) {
        this.descricao = descricao;
    }
}
