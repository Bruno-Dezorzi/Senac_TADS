/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.exercicio2;

/**
 *
 * @author HP Victus
 */
public class ContaCorrente extends Conta implements Tributavel  {

    public ContaCorrente() {
    }
    
    

    @Override
    public double sacar(double quantidade) {
       return quantidade;
    }

    @Override
    public double depositar(double quantidade) {
        return quantidade;
    }

    @Override
    public double obterSaldo(double quantidade) {
        return quantidade;
    }

    @Override
    public double calculaTributos(double quantidade) {
        return quantidade;
    }
    
}
