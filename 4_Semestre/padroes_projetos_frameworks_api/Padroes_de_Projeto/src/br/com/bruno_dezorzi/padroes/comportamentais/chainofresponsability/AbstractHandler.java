package br.com.bruno_dezorzi.padroes.comportamentais.chainofresponsability;

public abstract class AbstractHandler implements Handler{

    protected Handler proximo;
    
    protected void chamarProximo(String usuario, double valor) {
        if (proximo != null) {
            proximo.processar(usuario, valor);
        }
    }


    @Override
    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }
}
