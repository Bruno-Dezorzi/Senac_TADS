/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.polimorfismo.exercicios.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Desenvolvedor extends Funcionario{
    private double desconto;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome,  double salarioBase,double desconto) {
        super(nome, salarioBase);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    @Override
    public double calcularSalarioTotal(double salarioBase, double bonus, double desconto){     
        return salarioBase - desconto;
    }
}
