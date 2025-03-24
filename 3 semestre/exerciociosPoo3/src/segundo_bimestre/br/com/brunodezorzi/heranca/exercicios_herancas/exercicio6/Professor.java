/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio6;

/**
 *
 * @author HP Victus
 */
public class Professor extends Pessoa{
    private String departamento;

    public Professor() {
    }

    public Professor(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    

    @Override
    public String apresentar() {
        return "Professor: " + getNome() + " idade: " + getIdade()  + " Disciplina:" + getDepartamento();  
    }
    
    
    
}
