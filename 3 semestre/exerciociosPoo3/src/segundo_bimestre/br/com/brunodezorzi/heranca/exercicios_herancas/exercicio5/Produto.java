/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio5;

/**
 *
 * @author HP Victus
 */
public abstract class Produto {
    private String identificacao; // Primeiramente usando palavras com ç e ~
    private double custoFabricacao;
    
    Produto(String identificacao, double custoFabricacao){  // O idela é utilizar o nome dos próprios atributos como paramêtros para melhor entendimento do código
        this.identificacao = identificacao; // Falta do uso do this para se referenciar a classe
        this.custoFabricacao = custoFabricacao;
    }
    
    abstract public String toString(); 
    abstract public void novoCusto(double novoCusto); // Relembrando nesse tipo de caso se deve colocar a classe como abstract já que estamos exigindo que seus herdeiros
                                                        // tenham esses métodos implementados
}
