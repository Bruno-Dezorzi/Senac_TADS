/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.testes.TimeJogador;

/**
 *
 * @author HP Victus
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Time time = new Time();
        
        Jogador jogador1 = new Jogador("João", 1, PosicaoTatica.GOLEIRO);
        Jogador jogador2 = new Jogador("Pedro", 2, PosicaoTatica.ZAGUEIRO);
        Jogador jogador3 = new Jogador("Lucas", 3, PosicaoTatica.ZAGUEIRO);
        Jogador jogador4 = new Jogador("Carlos", 4, PosicaoTatica.ZAGUEIRO);
        Jogador jogador5 = new Jogador("André", 5, PosicaoTatica.MEIO);
        Jogador jogador6 = new Jogador("Thomas", 6, PosicaoTatica.LATERAL);
        Jogador jogador7 = new Jogador("Rafael", 7, PosicaoTatica.MEIO);
        Jogador jogador8 = new Jogador("Vitor", 8, PosicaoTatica.MEIO);
        Jogador jogador9 = new Jogador("Marcos", 9, PosicaoTatica.ATACANTE);
        Jogador jogador10 = new Jogador("Thiago", 10, PosicaoTatica.ATACANTE);
        Jogador jogador11 = new Jogador("Bruno", 11, PosicaoTatica.ATACANTE);
        
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);
        time.adicionarJogador(jogador4);
        time.adicionarJogador(jogador5);
        time.adicionarJogador(jogador6);
        time.adicionarJogador(jogador7);
        time.adicionarJogador(jogador8);
        time.adicionarJogador(jogador9);
        time.adicionarJogador(jogador10);
        time.adicionarJogador(jogador11);
        
        System.out.println("Jogadores do Time");
        
        time.consultarJogadores();
        
        time.substituirJogador(0, jogador11);
        time.consultarJogadores();
    }
    
}
