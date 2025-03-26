package br.com.bruno_dezorzi.estruturais.facade;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Cozinha cozinha = new Cozinha();
        Entrega entrega = new Entrega();
        Pagamento pagamento = new Pagamento();
        
        Gerenciador gerenciador = new Gerenciador(cozinha, entrega, pagamento, pedido);

        gerenciador.atendimento("Hamburguer", "Débito");
    }
}
