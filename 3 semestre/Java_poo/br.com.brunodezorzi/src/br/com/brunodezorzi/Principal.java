package br.com.brunodezorzi;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Principal {

    public static void main(String[] args) {

        /*Celular celular = new Celular();

        celular.ligar();
        celular.setCor("Magenta");
        celular.setAltura(2);
        celular.setLargura(3);
        celular.setPeso(6);
        celular.setTecnologia("Android");

        System.out.println(celular.toString());*/

        Scanner leia = new Scanner(System.in);

        /*System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Seu nome é "+ nome + "!");*/

        System.out.print("Digite o primeiro número: ");
        int num1 = Integer.parseInt(leia.nextLine());
        System.out.print("Digite o segundo número: ");
        int num2 = Integer.parseInt(leia.nextLine());

        System.out.println("A adição dos números é: " + (num1 + num2));
        System.out.println("A subtração dos números é: " + (num1 - num2));
        System.out.println("A multiplicação dos números é: " + (num1 * num2));
        System.out.println("A divisão dos números é: " + Double.parseDouble(String.valueOf(num1 / num2)));




    }
}
