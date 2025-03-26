package br.com.bruno_dezorzi.padroes.comportamentais.chainofresponsability;



public class Principal {
    public static void main(String[] args) {
        Handler validacao = new ValidacaoValorHendler();
        Handler saldo = new ValidacaoSaldoHeandler();
        Handler limite = new VerificarLimiteHandler();
        Handler banco = new VerificarBancoHandler();
        Handler processador = new ProcessarPagamentoHandler();

        validacao.setProximo(saldo);
        saldo.setProximo(limite);
        limite.setProximo(banco);
        banco.setProximo(processador);

        System.out.println("Tentando processar pagamento para João");
        validacao.processar("João", 300);

    }
}
