package segundo_bimestre.br.com.brunodezorzi.polimorfismo.exercicios.exercicio1;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioTotal(double salarioBase, double bonus, double desconto) {
        return salarioBase + bonus;
    }
}
