package br.com.bruno_dezorzi.padroes.comportamentais.chainofresponsability;

public class ValidacaoSaldoHeandler  extends AbstractHandler{

    @Override
    public void processar(String usuario, double valor) {
        if(valor > 1000){
            System.out.println("Erro: Pagamento excede o limite permitido");
            return;
        }
        chamarProximo(usuario, valor);
    }


}
