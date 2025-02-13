/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.setembro.praticaEnum.exercicio4;

/**
 *
 * @author HP Victus
 */
public enum TipoPagamento {
    CARTAO_CREDITO(2.5), 
    CARTAO_DEBITO(2.6), 
    PAYPAL(3.7), 
    TRANSFERENCIA_BANCARIA(1.2);
    
    private double taxaTransacao;
    
    TipoPagamento(double taxaTransacao){
        this.taxaTransacao = taxaTransacao;
    }
    
    public double gettaxaTransacao(){
        return taxaTransacao;
    }
    
}
