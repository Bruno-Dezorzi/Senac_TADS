/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca;

/**
 *
 * @author HP Victus
 */
public class Professor extends Funcionario{
    private String[] disciplica;

    public Professor() {
    }

    public Professor(String[] disciplica) {
        this.disciplica = disciplica;
    }

    public String[] getDisciplica() {
        return disciplica;
    }

    public void setDisciplica(String[] disciplica) {
        this.disciplica = disciplica;
    }
    
    
}
