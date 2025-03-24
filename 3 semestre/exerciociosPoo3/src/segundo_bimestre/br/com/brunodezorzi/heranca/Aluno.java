/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca;

/**
 *
 * @author HP Victus
 */
public class Aluno extends Pessoa {
    private long matricula;
    private int[] notas;
    
    public Aluno(){
       
    }

    public Aluno(long matricula, int[] notas,String nome, String email, int idade, char Sexo) {
        this.matricula = matricula;
        this.notas = notas;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.Sexo = Sexo;
    }
    
    

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    
    
}
