/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio10;

import java.util.Scanner;

/**
 *
 * @author HP Victus
 */
public class ContaBancaria {
    
    
    Scanner leia = new Scanner(System.in);
    
    private int numeroConta;
    private double saldo = 0;
    private String senha;

    public ContaBancaria(int numeroConta, double saldo, String senha) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void depositar() {
        double valor = 0;

        while (true) {
            System.out.print("Digite a quantidade: ");
            try {
                valor = leia.nextDouble();
                
                if (valor <= 0) {
                    System.out.println("Não se adiciona números negativos ou Zero. Insira novamente.");
                } else {
                    break; // Se o valor for positivo, saia do loop
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Insira um número válido.");
                leia.next(); // Limpa a entrada inválida
            }
        }
        
        this.saldo = getSaldo() + valor;
        
        System.out.println("Deposito realizado");
    }
    
    public void sacar(){
        double valor = 0;
        
        while (true){
            try{
                valor = leia.nextDouble();

                if(valor <= 0 ){
                    System.out.println("Não se saca valores negativos e Zero, Insira um valor positivo");
                } else{
                    break;
                }
            } catch (Exception e){
                System.out.println("Valor não aceitável");
                leia.next();
            }
        }
        
        this.saldo = getSaldo() - valor;
        
        System.out.println("Saque realizado");
    }
    
    
    
    
    
    
    
}