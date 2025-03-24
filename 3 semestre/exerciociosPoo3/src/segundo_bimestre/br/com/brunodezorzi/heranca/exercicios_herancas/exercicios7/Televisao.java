/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicios7;

/**
 *
 * @author HP Victus
 */
public class Televisao extends Eletronico {
    private int tamanhoTela;

    public Televisao() {
    }

    public Televisao(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public void ligar() {
         System.out.println("A Televisão está ligada");
    }
    
    
}
