/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable;

/**
 *
 * @author HP Victus
 */
public class Test {
    public static void main(String[] args) {
        Aluno aluno_1 = new Aluno(807365841, "Chico Buarque");
        Aluno aluno_2 = new Aluno(665422653, "Marielle");
        Aluno aluno_3 = new Aluno(111983749, "Bacuaru");
        
        
        HashTable tabela = new HashTable();
        
        tabela.put(aluno_1.getMatricula(), aluno_1);
        tabela.put(aluno_2.getMatricula(), aluno_2);
        tabela.put(aluno_3.getMatricula(), aluno_3);
        
        Aluno alunoTeste = tabela.get(807365841);
        
        System.out.println(alunoTeste.getNome());
    }
}
