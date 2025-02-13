/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.setembro.praticaEnum.exercicio4;

/**
 *
 * @author HP Victus
 */
public class ProcessadorPagamento {
    
    public void processarPagamento(TipoPagamento tipo, double valor) {
        // Calcula a taxa de transação
        double taxa = valor * (tipo.gettaxaTransacao() / 100);
        // Imprime o valor da taxa de transação
        System.out.printf("Pagamento de R$%.2f usando %s tem uma taxa de R$%.2f%n",
                valor, tipo, taxa);
    }

    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        // Exemplo de uso
        processador.processarPagamento(TipoPagamento.CARTAO_CREDITO, 1000.00);
        processador.processarPagamento(TipoPagamento.PAYPAL, 500.00);
    }
    
}
