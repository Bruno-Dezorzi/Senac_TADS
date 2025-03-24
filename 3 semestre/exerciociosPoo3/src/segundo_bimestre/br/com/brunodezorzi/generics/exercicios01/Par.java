/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.generics.exercicios01;

/**
 *
 * @author HP Victus
 */   
public class Par<T, U> {
    private T primeiro;
    private U segundo;

    public Par(T primeiro, U segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public Par() {
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }
    
    public void resultado(){
        System.out.println("Seus resultados: " + getPrimeiro() + " , " + getSegundo());
    }
}
