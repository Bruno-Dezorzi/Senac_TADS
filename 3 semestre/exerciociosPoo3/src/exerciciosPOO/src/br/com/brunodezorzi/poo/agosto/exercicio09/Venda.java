package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio09;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos;
    private Double valorTotal;

    public Venda() {
        this.produtos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidade_estoque() >= quantidade) {
            produto.setQuantidade_estoque(produto.getQuantidade_estoque() - quantidade);
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
            valorTotal += produto.getPreco() * quantidade;
        } else {
            System.out.println("Quantidade em estoque insuficiente para o produto: " + produto.getNome());
        }
    }

    public void mostrarCarrinho() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - Preço: " + produto.getPreco());
        }
        System.out.println("Valor total da compra: " + valorTotal);
    }

    public void finalizarVenda() {
        System.out.println("Venda finalizada para o cliente: " + cliente.getNome());
        System.out.println("Produtos comprados:");
        mostrarCarrinho();
    }
}
