/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.exercicio2;

/**
 *
 * @author HP Victus
 */
public abstract class Conta {
    private double saldo;
    
    public abstract double sacar(double quantidade);
    public abstract double depositar(double quantidade);
    public abstract double obterSaldo(double quantidade);
    
}
