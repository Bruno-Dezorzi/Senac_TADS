package segundo_bimestre.br.com.brunodezorzi.polimorfismo.exercicios.exercicio1;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal(double salarioBase, double bonus, double desconto) {
        return salarioBase + bonus - desconto;
    }
}
