package lista.Lista_Duplamente_Ligada;

public class ListaDuplamenteEncadeada<T> {
    private Nod<T> inicio;
    private Nod<T> fim;
    private int quantidade;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.quantidade = 0;
    }

    // a. Adiciona no início
    public void adicionaNoInicio(T elemento) {
        Nod<T> no = new Nod<>(elemento);
        if (this.inicio == null) {
            this.inicio = no;
            this.fim = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio.setAnterior(no);
            this.inicio = no;
        }
        quantidade++;
    }

    // b. Adiciona no fim
    public void adicionaNoFim(T elemento) {
        Nod<T> no = new Nod<>(elemento);
        if (this.fim == null) {
            this.fim = no;
            this.inicio = no;
        } else {
            no.setAnterior(this.fim);
            this.fim.setProximo(no);
            this.fim = no;
        }
        quantidade++;
    }

    // c. Adiciona em qualquer posição
    public void adiciona(int posicao, T elemento) {
        if (posicao < 1 || posicao > quantidade + 1) {
            throw new IllegalArgumentException("Posição inválida");
        }

        Nod<T> novoNo = new Nod<>(elemento);

        if (posicao == 1) {
            adicionaNoInicio(elemento);
        } else if (posicao == quantidade + 1) {
            adicionaNoFim(elemento);
        } else {
            Nod<T> atual = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            Nod<T> proximo = atual.getProximo();
            atual.setProximo(novoNo);
            novoNo.setAnterior(atual);
            novoNo.setProximo(proximo);
            proximo.setAnterior(novoNo);
            quantidade++;
        }
    }

    // d. Busca posição pela frente (caminhando pelo próximo)
    public int buscaPosicaoFrente(T elemento) {
        Nod<T> atual = inicio;
        int posicao = 1;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }
        return -1; // Elemento não encontrado
    }

    // e. Busca posição pelo fim (caminhando pelo anterior)
    public int buscaPosicaoTras(T elemento) {
        Nod<T> atual = fim;
        int posicao = quantidade;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }
            atual = atual.getAnterior();
            posicao--;
        }
        return -1; // Elemento não encontrado
    }

    // f. Remove do início
    public void removeDoInicio() {
        if (inicio == null) {
            System.out.println("Lista Vazia");
            return;
        }

        if (inicio == fim) { // Só há um elemento
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
        quantidade--;
    }

    // g. Remove do fim
    public void removeDoFim() {
        if (fim == null) {
            System.out.println("Lista Vazia");
            return;
        }

        if (inicio == fim) { // Só há um elemento
            inicio = null;
            fim = null;
        } else {
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
        quantidade--;
    }

    // h. Remove de uma posição específica
    public void remove(int posicao) {
        if (posicao < 1 || posicao > quantidade) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (posicao == 1) {
            removeDoInicio();
        } else if (posicao == quantidade) {
            removeDoFim();
        } else {
            Nod<T> atual = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            Nod<T> noParaRemover = atual.getProximo();
            Nod<T> proximo = noParaRemover.getProximo();
            atual.setProximo(proximo);
            if (proximo != null) {
                proximo.setAnterior(atual);
            }
            quantidade--;
        }
    }

    // i. Retorna a quantidade de elementos na lista
    public int tamanhoLista() {
        return quantidade;
    }

    // j. Retorna o último elemento
    public T ultimoElemento() {
        if (fim == null) {
            return null;
        }
        return fim.getElemento();
    }

    // k. Retorna o primeiro elemento
    public T primeiroElemento() {
        if (inicio == null) {
            return null;
        }
        return inicio.getElemento();
    }

    // l. Exibe a lista
    public void exibirLista() {
        if (this.inicio == null) {
            System.out.println("[]");
            return;
        }

        Nod<T> atual = this.inicio;
        System.out.print("[");
        while (atual.getProximo() != null) {
            System.out.print(atual.getElemento() + ", ");
            atual = atual.getProximo();
        }
        System.out.print(atual.getElemento());
        System.out.println("]");
    }

    // m. Percorre a lista do início ao fim
    public void percorreDoInicio() {
        Nod<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    // n. Percorre a lista do fim ao início
    public void percorreDoFim() {
        Nod<T> atual = fim;
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getAnterior();
        }
        System.out.println();
    }
}
