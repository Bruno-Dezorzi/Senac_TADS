package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public class TransporteFerroviario implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte Ferroviario");
    }
}
