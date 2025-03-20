package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public class Principal {

    public static void main(String[] args) {
        Logistica logisticaFerroviaria = new LogisticaFerroviaria();
        logisticaFerroviaria.organizarEntrega();

        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.organizarEntrega();

        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.organizarEntrega();
    }
}
