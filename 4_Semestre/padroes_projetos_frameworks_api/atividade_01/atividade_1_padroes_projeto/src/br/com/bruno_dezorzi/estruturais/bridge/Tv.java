package br.com.bruno_dezorzi.estruturais.bridge;

public class Tv implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando a TV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a TV");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume da TV");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume da TV");
    }

}
