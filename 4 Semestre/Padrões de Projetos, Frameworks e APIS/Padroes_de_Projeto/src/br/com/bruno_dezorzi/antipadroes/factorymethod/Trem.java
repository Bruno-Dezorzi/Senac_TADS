package br.com.bruno_dezorzi.antipadroes.factorymethod;

public class Trem extends Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando de trem");
    }
}
