package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public class LogisticaTerrestre extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerreste();
    }
}
