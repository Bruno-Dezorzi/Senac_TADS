package br.com.brunodezorzi.poo.agosto.exercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 4:");
        System.out.println();
        Retangulo retangulo = new Retangulo(10,20);

        System.out.println("A área é de " + retangulo.calcularArea() + " e o perímetro é de " + retangulo.calcularPerimetro() );

    }
}
