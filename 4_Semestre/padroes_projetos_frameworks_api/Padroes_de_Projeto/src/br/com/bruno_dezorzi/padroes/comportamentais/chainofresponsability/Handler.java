package br.com.bruno_dezorzi.padroes.comportamentais.chainofresponsability;

public interface Handler {

    void setProximo(Handler proximo);
    void processar(String usuario, double valor);
}
