package br.com.bruno_dezorzi.estruturais.bridge;

public class Projetor implements Dispositivo{
    
    @Override
    public void ligar() {
        System.out.println("Ligando a Projetor");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a Projetor");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume da Projetor");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume da Projetor");
    }
}
