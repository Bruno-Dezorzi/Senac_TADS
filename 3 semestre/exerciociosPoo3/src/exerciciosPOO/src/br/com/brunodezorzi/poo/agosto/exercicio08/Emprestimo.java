
package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio08;

import java.util.Date;
import java.util.List;


public class Emprestimo {
    private List<Livro> Livro;
    private List<Date> dataemprestimo;
    
    public Emprestimo(){
        
    }

    public List<Livro> getLivro(Livro livro) {
        return Livro;
    }

    public void setLivro(List<Livro> Livro) {
        this.Livro = Livro;
    }

    public Date getDataemprestimo(Date dataemprestimo) {
        return dataemprestimo;
    }

    public void setDataemprestimo(List<Date> dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    
    
    public void mostrarEmprestimos(){
        for(int i = 0; i < Livro.size(); i++){
            System.out.println(Livro.get(i) + "," + dataemprestimo.get(i));
        }
    }

   
    
    
    
    
}
