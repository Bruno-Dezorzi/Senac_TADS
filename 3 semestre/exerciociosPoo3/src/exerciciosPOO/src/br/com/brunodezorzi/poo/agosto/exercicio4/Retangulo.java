package br.com.brunodezorzi.poo.agosto.exercicio4;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return altura*largura;
    }

    public double calcularPerimetro(){
        return (2*altura)+(2*largura);
    }
}
