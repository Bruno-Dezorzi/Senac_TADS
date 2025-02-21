package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public class LogisticaMaritima extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}
