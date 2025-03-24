/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Veiculo car = new Carro();
    
        Veiculo bike = new Bicicleta();
    
    
        car.acelerar();
        car.frear();
        car.vira("Esquerda");
        
        System.out.println("");
        
        
        bike.acelerar();
        bike.frear();
        bike.vira("Direita");
    }
    
}
