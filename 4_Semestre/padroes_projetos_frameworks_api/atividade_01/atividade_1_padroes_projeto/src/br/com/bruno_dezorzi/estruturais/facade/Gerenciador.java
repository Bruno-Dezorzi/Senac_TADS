package br.com.bruno_dezorzi.estruturais.facade;

public class Gerenciador {
    private Pedido pedido;
    private Cozinha cozinha;
    private Entrega entrega;
    private Pagamento pagamento;

    public Gerenciador(Cozinha cozinha, Entrega entrega, Pagamento pagamento, Pedido pedido) {
        this.cozinha = cozinha;
        this.entrega = entrega;
        this.pagamento = pagamento;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void atendimento(String pedido, String forma){
        this.pedido.seuPedido(pedido);
        cozinha.preparacao();
        cozinha.pronto();
        entrega.saindoEntrega();
        entrega.chegou();
        pagamento.formaPagamento(forma);
    }

}
