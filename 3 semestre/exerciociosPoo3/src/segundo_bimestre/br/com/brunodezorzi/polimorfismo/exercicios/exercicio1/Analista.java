package segundo_bimestre.br.com.brunodezorzi.polimorfismo.exercicios.exercicio1;

public class Analista extends Funcionario {
   

    public Analista(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        
    }

    @Override
    public double calcularSalarioTotal(double salarioBase, double bonus, double desconto) {
        return salarioBase + (bonus * 0.8) - desconto; // Analistas ganham 80% do bônus
    }
}
