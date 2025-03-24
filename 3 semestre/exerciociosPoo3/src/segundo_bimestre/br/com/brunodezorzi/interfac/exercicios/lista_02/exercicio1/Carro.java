/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("ACELERAAAAA O CARROOO");
    }

    @Override
    public void frear() {
        System.out.println("FREANDO O CARROO");
    }

    @Override
    public void vira(String direcao) {
        System.out.println("Virando o carro para a " + direcao);
    }
    
    
}
