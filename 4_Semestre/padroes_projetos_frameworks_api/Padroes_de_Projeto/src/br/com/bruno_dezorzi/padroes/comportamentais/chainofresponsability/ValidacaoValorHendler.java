package br.com.bruno_dezorzi.padroes.comportamentais.chainofresponsability;

public class ValidacaoValorHendler extends AbstractHandler{

    @Override
    public void processar(String usuario, double valor) {
        if(valor <= 0 ){
            System.out.println("Erro: o valor do pagamento deve ser maior que zero");
            return;
        }
        chamarProximo(usuario, valor);
    }
    



}
