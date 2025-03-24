/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio5;

/**
 *
 * @author HP Victus
 */
public class DiscoOtico extends Dispositivo {

//     public DiscoOtico(long c){
//        super("Disco Ótico", c);  // Usar o valor de c no super
//        
//    }
    
   public DiscoOtico(long capacidade){
        super("Disco Ótico", capacidade);  // Passa nome e capacidade para a classe mãe
    }

    @Override
    public String toString(){
        // Usando um método get para pegar o nome e capacidade
        return "Dispositivo: " + getNome() + " Capacidade: " + capacidadeEmMegaBytes() + " MB";
    }

    @Override
    public double capacidadeEmMegaBytes(){
        // Converter bytes para megabytes (1 MB = 1.048.576 bytes)
        return getCapacidadeEmBytes() / 1048576.0;
    }
}
