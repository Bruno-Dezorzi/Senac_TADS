package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio08;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    
    private List<Usuario> usuarios;
    private List<Livro> livros;
    private Emprestimo emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new Emprestimo();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Emprestimo getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public void emprestarlivro(Livro livro, Date dataemprestimo){
        if(livro.getDisponibilidade()) {
            livro.setDisponibilidade(false);
            System.out.println("Livro emprestado");
            emprestimos.getLivro(livro);
            emprestimos.getDataemprestimo(dataemprestimo);
        } else {
            System.out.println("O livro não está disponível");
        }
    }
    
    public void devolverLivro(Livro livro){
        livro.setDisponibilidade(true);
    }
    
    public void mostrarLivros(){
        for(Livro livro : livros){
            System.out.println(livro.getTitulo() + "," + livro.getAutor() + "," + livro.getAnoPublicacao());
        }
    }
    
    public void mostrarEmprestimos(){
        emprestimos.mostrarEmprestimos();
    }
    
    public String consultarDisponibilidade(Livro livro) {
        return livro.getDisponibilidade() ? "Disponível" : "Indisponível";
    }
}
