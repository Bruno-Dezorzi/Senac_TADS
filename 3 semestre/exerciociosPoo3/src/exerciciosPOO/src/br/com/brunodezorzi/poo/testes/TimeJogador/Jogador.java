/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.testes.TimeJogador;

/**
 *
 * @author HP Victus
 */
public class Jogador {
    
    private String nome;
    private int numero;
    private PosicaoTatica posicaoTatica;

    public Jogador(String nome, int numero, PosicaoTatica posicaoTatica) {
        this.nome = nome;
        this.numero = numero;
        this.posicaoTatica = posicaoTatica;
    }

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public PosicaoTatica getPosicaoTatica() {
        return posicaoTatica;
    }

    public void setPosicaoTatica(PosicaoTatica posicaoTatica) {
        this.posicaoTatica = posicaoTatica;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", numero=" + numero + ", posicaoTatica=" + posicaoTatica + '}';
    }
    
    
    
}
