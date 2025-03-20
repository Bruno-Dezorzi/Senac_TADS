package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public class LogisticaFerroviaria extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }
}
