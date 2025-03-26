package br.com.bruno_dezorzi.antipadroes.comportamentais.chainofresponsability;

public class Principal {
    public static void main(String[] args) {
        ProcessarPagamento pagamento = new ProcessarPagamento();
        pagamento.processarPagamento("Bruno", 300);
        pagamento.processarPagamento("Bruno", 300);
    }
}
