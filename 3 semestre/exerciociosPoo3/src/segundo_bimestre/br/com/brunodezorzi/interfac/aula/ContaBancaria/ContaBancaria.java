/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.aula.ContaBancaria;

/**
 *
 * @author HP Victus
 */
public class ContaBancaria implements Notificacoes,OPeracaoBancaria,Relatorios {

    public ContaBancaria() {
    }
    
    

    @Override
    public void enviarNotificacoes(String mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Você depositou " + quantia);
    }

    @Override
    public void sacar(double quantia) {
        System.out.println("Você sacou " + quantia);
    }

    @Override
    public double consultarSaldo() {
        return 200.00;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("SEU SALDO É DE " + consultarSaldo());
    }
    
}
