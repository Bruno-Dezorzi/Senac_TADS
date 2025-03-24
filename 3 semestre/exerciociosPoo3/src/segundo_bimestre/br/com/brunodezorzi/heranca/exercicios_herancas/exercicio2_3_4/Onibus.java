/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio2_3_4;

/**
 *
 * @author HP Victus
 */
public class Onibus extends Veiculo{
    private int assentos;

    public Onibus() {
    }

    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(int assentos, String placa, int ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); 
        System.out.println("Onibus{" + "assentos=" + assentos + '}'); 
    }
    
    
    
}
