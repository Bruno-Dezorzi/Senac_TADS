package br.com.bruno_dezorzi.padroes.criacionais.factorymethod;

public class TransporteMaritimo implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte Maritimo");
    }
}
