package br.com.brunodezorzi.poo.agosto.exercicio7;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Bruno","Pademeu", 200000.0,2002 );

        Double valorimovel = imovel.calcularValorVenda(2020,2.0);

        System.out.println(valorimovel);
    }
}
