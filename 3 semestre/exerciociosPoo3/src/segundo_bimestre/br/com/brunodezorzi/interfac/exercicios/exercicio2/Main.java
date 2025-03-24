/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.exercicio2;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Conta poup = new ContaPoupanca();
        ContaCorrente corr = new ContaCorrente();
        
        corr.depositar(200);
        corr.sacar(300);
        corr.obterSaldo(500);
        corr.calculaTributos(400);
        
        poup.depositar(200);
        poup.sacar(300);
        poup.obterSaldo(500);
        
    }
}
