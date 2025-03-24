/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio5;

/**
 *
 * @author HP Victus
 */
public class Contador implements Resetavel, Modificavel {
    
    private int valor;
    
    

    @Override
    public void reseta() {
        valor = 1;
    }

    @Override
    public void reseta(int origem) {
        
    } // isso não existe também na lista de exercícios

    @Override
    public void modifica(int tamanho) {
        //valor = tam; // Não existe essa variável
    }
    
}
