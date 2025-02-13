package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio08;

public class Usuario {
    private String nome;
    private int idade;
    private int numeroIdentificacao;

    public Usuario(String nome, int idade, int numeroIdentificacao) {
        this.nome = nome;
        this.idade = idade;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }
}

