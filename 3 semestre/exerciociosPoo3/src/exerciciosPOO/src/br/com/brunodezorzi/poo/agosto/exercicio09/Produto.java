package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio09;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade_estoque;

    public Produto(){

    }

    public Produto(String nome, Double preco, Integer quantidade_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(Integer quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
}
