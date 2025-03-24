/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca;

import java.util.Objects;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");
        aluno.setEmail("bruno@@");
        aluno.setSexo('M');
        aluno.setMatricula(123456);
        aluno.setNotas(new int[] {1,2,3,4,5});
        
        
    }
}
