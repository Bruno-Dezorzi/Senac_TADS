package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio09;

public class Cliente {
    private String nome;
    private String email;
    private Integer cpf;

    public Cliente(){

    }

    public Cliente(String nome, String email, Integer cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}
