package br.com.brunodezorzi.poo.agosto.exercicio3;

public class Main {
    public static void main(String[] args) {
         System.out.println("Exercício 3:");
        System.out.println();
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta(123456);
        conta.setTitular("Bruno");
        conta.setSaldo(500);

        System.out.println("Número da Conta: " + conta.getNumeroDaConta() +
                   ", Titular: " + conta.getTitular() +
                   ", Saldo: " + conta.getSaldo());

        conta.setSaldo(300);

        System.out.println("Novo Saldo: " + conta.getSaldo());

    }
}
