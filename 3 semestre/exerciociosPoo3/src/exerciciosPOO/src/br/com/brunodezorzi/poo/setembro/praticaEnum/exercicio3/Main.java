/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.setembro.praticaEnum.exercicio3;

import java.util.Scanner;
/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha uma estação: 1 - Verão, 2 - Primavera, 3 - Outono, 4 - Inverno");
        int numero = leia.nextInt();

        EstacaoDoAno estacaoEscolhida = null;

        // Verifica a estação escolhida pelo número
        switch (numero) {
            case 1:
                estacaoEscolhida = EstacaoDoAno.VERAO;
                break;
            case 2:
                estacaoEscolhida = EstacaoDoAno.PRIMAVERA;
                break;
            case 3:
                estacaoEscolhida = EstacaoDoAno.OUTONO;
                break;
            case 4:
                estacaoEscolhida = EstacaoDoAno.INVERNO;
                break;
            default:
                System.out.println("Escolha inválida!");
                return;
        }

        // Exibe a temperatura média da estação escolhida
        if (estacaoEscolhida != null) {
            System.out.println("A temperatura média de " + estacaoEscolhida + " é: " + estacaoEscolhida.getTemperaturaMedia() + "°C");
        }
    }
}
