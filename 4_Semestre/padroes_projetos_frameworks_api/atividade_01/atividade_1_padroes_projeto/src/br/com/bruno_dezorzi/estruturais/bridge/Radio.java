package br.com.bruno_dezorzi.estruturais.bridge;

public class Radio implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando a Radio");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a Radio");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume da Radio");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume da Radio");
    }
}
