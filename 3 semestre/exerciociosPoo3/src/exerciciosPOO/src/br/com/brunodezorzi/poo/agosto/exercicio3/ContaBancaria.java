package br.com.brunodezorzi.poo.agosto.exercicio3;

public class ContaBancaria {
    private int numeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(){

    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void mostrarInformacoes(){
        System.out.println("Numero da Conta:" + numeroDaConta);
        System.out.println("Titular: " + titular);
        System.out.println("O saldo: " + saldo);

    }
}
