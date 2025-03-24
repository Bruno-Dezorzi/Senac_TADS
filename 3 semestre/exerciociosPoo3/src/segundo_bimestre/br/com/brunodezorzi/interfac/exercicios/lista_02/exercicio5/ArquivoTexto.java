/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio5;

/**
 *
 * @author HP Victus
 */
public class ArquivoTexto implements Arquivo{

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de texto.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de texto.");
    }

    @Override
    public void ler() {
        System.out.println("Lendo conteúdo do arquivo de texto.");
    }
    
}
