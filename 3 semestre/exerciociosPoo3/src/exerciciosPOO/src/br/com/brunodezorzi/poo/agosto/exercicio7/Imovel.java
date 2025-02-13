package br.com.brunodezorzi.poo.agosto.exercicio7;

public class Imovel {
    private String nome_proprietario;
    private String endereco;
    private Double valor_compra;
    private Integer ano_construcao;

    public Imovel(){

    }

    public Imovel(String nome_proprietario, String endereco, Double valor_compra, Integer ano_construcao){
        this.nome_proprietario = nome_proprietario;
        this.endereco = endereco;
        this.valor_compra = valor_compra;
        this.ano_construcao = ano_construcao;

    }

    public void setNome_proprietario(String nome_proprietario){
        this.nome_proprietario = nome_proprietario;
    }

    public String getNome_proprietario(){
        return nome_proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Integer getAno_construcao() {
        return ano_construcao;
    }

    public void setAno_construcao(Integer ano_construcao) {
        this.ano_construcao = ano_construcao;
    }


    public Double calcularValorVenda(Integer ano_venda, Double taxa_correcao_monetaria){
        Double taxa_arrumada = taxa_correcao_monetaria/100;
        Double resultado = (valor_compra*((ano_venda-ano_construcao)*taxa_arrumada)) + valor_compra;
        return resultado;
    }
}
