/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio5;

/**
 *
 * @author HP Victus
 */
public abstract class Dispositivo {
    private String nome;
    private long capacidadeEmBytes;
    
    public Dispositivo(String nome, long capacidade){
        this.nome = nome;
        this.capacidadeEmBytes = capacidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public long getCapacidadeEmBytes() {
        return capacidadeEmBytes;
    }
    
    abstract public String toString();
    abstract public double capacidadeEmMegaBytes();
}
