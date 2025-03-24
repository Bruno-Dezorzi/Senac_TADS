/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_03.exercicio1;

/**
 *
 * @author HP Victus
 */
public interface IPagamento {
     boolean autorizarPagamento(float valor);
     
     boolean capturarPagamento();
     
     boolean estornarPagamento(float valor);
     
     String getStatus();

    public void mensagemAceitacao();
}
