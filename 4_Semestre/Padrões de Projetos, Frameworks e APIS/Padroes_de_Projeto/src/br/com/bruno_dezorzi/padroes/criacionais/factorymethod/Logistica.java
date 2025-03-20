package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public abstract class Logistica {

    public abstract Transporte criarTransporte();

    public void organizarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
