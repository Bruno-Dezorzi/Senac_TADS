/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio2_3_4;

/**
 *
 * @author HP Victus
 */
public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao() { 
       
    }

    public Caminhao(int eixos, String placa, int ano) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
   
    @Override
    public void exibirDados() {
         super.exibirDados(); 
        System.out.println("Caminhao{" + "eixos=" + eixos + '}');
    }

    
    
   
    
    
}
