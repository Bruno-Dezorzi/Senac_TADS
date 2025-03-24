/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable;

import java.util.ArrayList;

/**
 *
 * @author HP Victus
 */
public class HashTable {
    private ArrayList<Aluno>[] tabela;


    public HashTable() {
        this.tabela = new ArrayList[20];
    }
    
    private int hash(int chave){
        return chave % this.tabela.length;
    }
    
    public Aluno get(int chave){
        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];
        if(alunos == null)
            return null;
        for(Aluno aluno : alunos){
            if(aluno.getMatricula() == chave){
                return aluno;
            }
        }
        return null;

    }
    
    public void put(int chave, Aluno valor){
        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];
        if(alunos == null){
            alunos = new ArrayList<Aluno>();
            alunos.add(valor);
        }
        else{
            for (int i = 0; i < alunos.size(); i++){
                if(alunos.get(i).getMatricula() == chave){
                    alunos.set(i,valor);
                    return;
                }
                alunos.add(valor);
            }
    }
    
    }
    
    public Aluno remove(int chave) {
    int hash = hash(chave);
    ArrayList<Aluno> alunos = this.tabela[hash];
    
    if (alunos != null) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula() == chave) {
                Aluno alunoRemovido = alunos.remove(i); // Remove o aluno e armazena para retorno
                if (alunos.isEmpty()) {
                    this.tabela[hash] = null; // Se a lista ficar vazia, remove-a da tabela
                }
                return alunoRemovido;
            }
        }
    }
    
    return null; // Retorna null se o aluno não for encontrado
}  
}