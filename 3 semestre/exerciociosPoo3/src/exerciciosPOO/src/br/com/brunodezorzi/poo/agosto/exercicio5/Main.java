package br.com.brunodezorzi.poo.agosto.exercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 5:");
        System.out.println();

        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowling" , 1997);
        Livro livro2 = new Livro("O Senhor dos Anéis a Sociedade do Anel", "J.R.R Tolkien" , 1954);
        Livro livro3 = new Livro("As Crônicas de Nárnia", "C.S Lewis" , 1950);


        livro.mostrarInformacoes();
        System.out.println();
        livro2.mostrarInformacoes();
        System.out.println();
        livro3.mostrarInformacoes();


    }
}
