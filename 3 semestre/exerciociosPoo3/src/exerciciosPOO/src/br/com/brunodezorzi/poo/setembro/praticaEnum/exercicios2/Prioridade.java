/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.setembro.praticaEnum.exercicios2;

/**
 *
 * @author HP Victus
 */
public enum Prioridade {
    BAIXA(1),
    MEDIA(2),
    ALTA(3),
    URGENTE(4);
    
    private int valor;

    private Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
