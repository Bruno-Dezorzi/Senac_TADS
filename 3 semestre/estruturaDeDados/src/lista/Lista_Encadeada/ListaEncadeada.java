package lista.Lista_Encadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int quantidade; 

    public ListaEncadeada() {
        this.inicio = null;
        this.quantidade = 0;
    }
    
    public ListaEncadeada(T elemento) {
        No<T> no = new No<>(elemento);
        this.inicio = no;
        this.quantidade = 1;
    }
    
     public int getQuantidade() {
        return this.quantidade;
    }
    
     public void adicionaNoInicio(T elemento) {
        No<T> no = new No<>(elemento);
        if (this.inicio == null) { // lista vazia
            this.inicio = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;
    }
     
   
    
    public void adicionaNoFinal(T elemento) {
        No<T> no = new No<>(elemento);
        if (this.inicio == null) { // lista vazia
            this.inicio = no;
        } else {
            No<T> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }
        this.quantidade++;
    }
     
      public int buscarPosicao(T elemento) {
        No<T> atual = this.inicio;
        int posicao = 1;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            } else {
                atual = atual.getProximo(); // faltava atualizar o atual aqui
                posicao++;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }
      
    public void removerInicio() {
        if (this.inicio == null) {
            System.out.println("Lista Vazia");
        } else {
            this.inicio = this.inicio.getProximo();
            this.quantidade--;
        }
    }
    
    public void removerDoFim() {
        if (this.inicio == null) { // lista já está vazia
            System.out.println("Lista Vazia");
        } else if (this.inicio.getProximo() == null) { // lista com 1 único elemento
            this.inicio = null;
        } else { // lista com vários elementos
            No<T> atual = this.inicio;
            while (atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(null);
        }
        this.quantidade--;
    }
    
    
      
    public int tamanhoLista(){
        return getQuantidade();
    }
    
   public void exibirLista() {
    if (this.inicio == null) {
        System.out.println("[]"); // Caso a lista esteja vazia, imprime apenas os colchetes
        return;
    }

    No<T> atual = this.inicio;
    System.out.print("["); // Início do formato da lista
    
    while (atual.getProximo() != null) {
        System.out.print(atual.getElemento() + ", ");
        atual = atual.getProximo();
    }
    
    System.out.print(atual.getElemento()); // Último elemento (sem a vírgula)
    System.out.println("]"); // Fechamento do formato da lista
    
    }
    
    public T ultimoElemento(){
        No<T> atual = this.inicio;
        while(atual != null){
            if(atual.getProximo() == null){
                T ultimoElemento = atual.getElemento();
                return ultimoElemento;
            }
            atual = atual.getProximo();
        }
        return null;
    }
    
    public T primeiroElemento(){
        return this.inicio.getElemento();
       
    }
    
    
    
    
    
    public No<T> noAnterior(int posicao) {
    if (posicao <= 1 || this.inicio == null) { // Não há nó anterior para a posição 1 ou se a lista está vazia
        return null;
    }
    
    No<T> atual = this.inicio;
    
    for (int i = 1; i < posicao - 1; i++) {
        if (atual.getProximo() == null) {
            return null; // Retorna null se a posição é inválida
        }
        atual = atual.getProximo();
    }
    return atual;
    }

    public No<T> noPosterior(int posicao) {
        No<T> atual = this.inicio;
        for (int i = 1; i < posicao + 1; i++) {
            if (atual.getProximo() == null) {
                return null; // Retorna null se a posição é inválida
            }
            atual = atual.getProximo();
        }
        return atual;
    }

    public void adicionar(T elemento, int posicao) {
        No<T> novoNo = new No<>(elemento);

        if (posicao == 1) { // Se for para adicionar no início
            novoNo.setProximo(inicio);
            this.inicio = novoNo;
            this.quantidade++;
            return;
        }

        No<T> noAnterior = noAnterior(posicao);

        if (noAnterior == null) {
            throw new IllegalArgumentException("Posição inválida"); // Verificação de posição
        }

        No<T> noPosterior = noAnterior.getProximo(); // O nó posterior ao anterior é o que estamos substituindo

        noAnterior.setProximo(novoNo);
        novoNo.setProximo(noPosterior);

        this.quantidade++;
    }

    public void remover(int posicao){
        No<T> noAnterior = noAnterior(posicao);
        No<T> noPosterior = noPosterior(posicao);
        
        noAnterior.setProximo(noPosterior);
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    
    
    
   
    
   
    
    public No<T> buscar(T elemento) {
        No<T> atual = this.inicio;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }
    
   
    
    

    
}
