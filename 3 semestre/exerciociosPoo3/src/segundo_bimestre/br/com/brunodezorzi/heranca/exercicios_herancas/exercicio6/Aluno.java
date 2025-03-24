/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio6;

/**
 *
 * @author HP Victus
 */
public class Aluno extends Pessoa{
    private String curso;

    public Aluno() {
    }

    
    
    public Aluno(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String apresentar() {
        return "Aluno: " + getNome() + " idade: " + getIdade() + " curso:" + getCurso();  
    }
    
    
    
}
