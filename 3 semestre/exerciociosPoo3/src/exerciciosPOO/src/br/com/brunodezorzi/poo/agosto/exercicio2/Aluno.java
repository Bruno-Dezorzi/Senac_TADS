package br.com.brunodezorzi.poo.agosto.exercicio2;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;

    public Aluno(String nome,int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula" + matricula);

    }
}
