/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio2_3_4;

/**
 *
 * @author HP Victus
 */
public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public void  exibirDados() {
         System.out.println("Veiculo{" + "placa=" + placa + ", ano=" + ano + "}");
    }
    
    
    // 3 - A classse não deve ser abstrata pois ela não é apenas um esqueleto para as outras, mas possui um método que ela não pode ser abstrata para as outras classses que 
    // extendem ela possam realizar
    
    // 4 - Não se deve ter um construtor pois não é objetivo instanciar ele, ele só serve de modelo base para outras classes, ela pode conter atributos importantes para 
    // criar outras, ela existe somente como auxilio
    
    
}
