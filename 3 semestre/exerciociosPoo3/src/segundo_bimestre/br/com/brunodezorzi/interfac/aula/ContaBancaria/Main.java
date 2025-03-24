/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.aula.ContaBancaria;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(300);
        conta.sacar(500);
        conta.enviarNotificacoes("IRINEU, SEU PAI NÃO SABE NEM EU!");
        conta.gerarRelatorio();
    }
}
