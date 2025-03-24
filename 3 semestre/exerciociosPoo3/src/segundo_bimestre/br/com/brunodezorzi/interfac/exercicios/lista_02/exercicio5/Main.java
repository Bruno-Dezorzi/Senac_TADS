/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio5;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        // Criação da coleção de objetos que implementam Arquivo
        Arquivo[] arquivos = {new ArquivoTexto(), new ArquivoImagem(), new ArquivoAudio()};

        // Iteração sobre a coleção, chamando os métodos definidos na interface
        for (Arquivo arquivo : arquivos) {
            arquivo.abrir();
            arquivo.ler();
            arquivo.fechar();
            System.out.println();
        }
    }
}
