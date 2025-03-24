/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio6;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        
        al.setNome("Bruno");
        al.setIdade(20);
        al.setCurso("ADS");
        
        Professor pf = new Professor();
        
        pf.setNome("Michel");
        pf.setIdade(30);
        pf.setDepartamento("Astronomia");
        
        System.out.println(al.apresentar());
        System.out.println(pf.apresentar());
    }
}
