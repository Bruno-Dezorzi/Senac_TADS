package br.com.brunodezorzi.poo.agosto.exercicio1;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;

    public Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro(){

    }


    public void mostrarInformacoes(){
        System.out.println("Marca:" + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return getModelo();
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }
}
