/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.setembro.praticaEnum.exercicio3;

/**
 *
 * @author HP Victus
 */
public enum EstacaoDoAno {
     PRIMAVERA(20),
    VERAO(30),  // Em Java, o "Verão" deve ser escrito sem o acento, pois o enum segue convenção de constantes em caixa alta sem caracteres especiais.
    OUTONO(15),
    INVERNO(5);

    private final int temperaturaMedia;

    // Construtor do enum para armazenar a temperatura média
    EstacaoDoAno(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    // Método para obter a temperatura média
    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }
}
