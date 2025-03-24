package exercicios;

import java.util.Scanner;

public class AulaStrings {

    public static int tamanhoPalavra(String palavra){
        String str = new String(palavra);;
        return  str.length();
    }

    public static String inverterPalavra(String palavra){
        StringBuilder sb = new StringBuilder(palavra);
        sb.reverse();
        return sb.toString();

    }


    public static void main(String[] args) {
        /*String str1 = "Hello World";
        String str2 = new String("Alô Mundo");

        System.out.println(str1 + " " + str1.length());
        System.out.println(str2 + " " + str2.length());

        char caracter = str1.charAt(0);
        System.out.println("O primeiro caracter de str1 é: " + caracter);

        String subs = str1.substring(6);

        System.out.println(subs);*/

        Scanner leia = new Scanner(System.in);

        /*Exercício 1
            System.out.print("Escreva uma palavra para o primeiro exercício: ");
            String se1 = leia.nextLine();
            System.out.println("A quantidade de caracteres que tem a palavra " + se1 + " é " + se1.length());*/

            System.out.print("Escreva uma palavra os exercícios: ");
            String palavra = leia.nextLine();

            int ex1 = tamanhoPalavra(palavra);
            System.out.println("A quantidade de caracteres que tem a palavra " + palavra + " é " + ex1);
         /*
        // Exercício 2
            System.out.print("Escreva uma palavra para o segundo exercício: ");
            String se2 = leia.nextLine();

        System.out.println("A palavra " + se2 + " invertida é " + se2.str);
          */
    }

}
