/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_03.exercicio1;

/**
 *
 * @author HP Victus
 */
public class LojaVirtual {
    public static void main(String[] args) {
        IPagamento pagamentoCartao = new CartaoCredito();
        IPagamento pagamentoPayPal = new PayPal();
        IPagamento pagamentoBoleto = new BoletoBancario();

        // Testando o pagamento via Cartão de Crédito
        pagamentoCartao.autorizarPagamento(100);
        System.out.println("Status Cartão: " + pagamentoCartao.getStatus());
        pagamentoCartao.capturarPagamento();
        System.out.println("Status Cartão: " + pagamentoCartao.getStatus());
        pagamentoCartao.estornarPagamento(100);
        System.out.println("Status Cartão: " + pagamentoCartao.getStatus());
        pagamentoCartao.mensagemAceitacao();

        // Testando o pagamento via PayPal
        pagamentoPayPal.autorizarPagamento(200);
        System.out.println("Status PayPal: " + pagamentoPayPal.getStatus());
        pagamentoPayPal.capturarPagamento();
        System.out.println("Status PayPal: " + pagamentoPayPal.getStatus());
        pagamentoPayPal.estornarPagamento(200);
        System.out.println("Status PayPal: " + pagamentoPayPal.getStatus());
        pagamentoPayPal.mensagemAceitacao();

        // Testando o pagamento via Boleto Bancário
        pagamentoBoleto.autorizarPagamento(300);
        System.out.println("Status Boleto: " + pagamentoBoleto.getStatus());
        pagamentoBoleto.capturarPagamento();
        System.out.println("Status Boleto: " + pagamentoBoleto.getStatus());
        pagamentoBoleto.estornarPagamento(300);
        System.out.println("Status Boleto: " + pagamentoBoleto.getStatus());
        pagamentoBoleto.mensagemAceitacao();
    }
}
