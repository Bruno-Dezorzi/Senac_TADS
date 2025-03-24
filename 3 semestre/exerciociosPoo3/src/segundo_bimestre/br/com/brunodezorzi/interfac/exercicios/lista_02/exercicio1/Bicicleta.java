/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Bicicleta implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("ACELERAAAAA A BICLICETAA");
    }

    @Override
    public void frear() {
        System.out.println("FREANDO O BICLICETAA");
    }

    @Override
    public void vira(String direcao) {
        System.out.println("Virando o BICLICETAA para a " + direcao);
    }
}
