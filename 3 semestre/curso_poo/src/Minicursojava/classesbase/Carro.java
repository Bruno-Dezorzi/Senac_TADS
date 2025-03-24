package Minicursojava.classesbase;

public class Carro {
    private int rodas ;
    private int portas ;
    private boolean ligado = false;

    public Carro(){

    }

    public Carro(int rodas, int portas, boolean ligado){
        this.rodas = rodas;
        this.portas = portas;
        this.ligado = ligado;

    }

    public void setRodas(int rodas){
        this.rodas = rodas;
    }

    public int getRodas(){
        return rodas;
    }

     public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPortas(){
        return portas;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void ligarCarro(){
        this.ligado = true;
        System.out.println("O carro está ligado");

    };

    public void desligarCarro(){
        this.ligado = false;
        System.out.println("O carro está desligado");
    }



}
