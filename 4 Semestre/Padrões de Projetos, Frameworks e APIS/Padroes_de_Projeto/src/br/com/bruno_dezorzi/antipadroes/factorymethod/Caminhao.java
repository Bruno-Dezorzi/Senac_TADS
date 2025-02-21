package br.com.bruno_dezorzi.antipadroes.factorymethod;

public class Caminhao extends Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando de caminhão");
    }
}
