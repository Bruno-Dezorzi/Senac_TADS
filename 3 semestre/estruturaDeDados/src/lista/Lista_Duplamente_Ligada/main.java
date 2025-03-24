package lista.Lista_Duplamente_Ligada;

public class main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

        // Adiciona elementos no início
        lista.adicionaNoInicio(3);
        lista.adicionaNoInicio(5);

        // Adiciona um elemento no fim
        lista.adicionaNoFim(80);

        // Exibe a lista
        System.out.println("Lista após adições no início e fim:");
        lista.exibirLista();

        // Adiciona no meio (posição 2)
        lista.adiciona(2, 70); // Adiciona o número 70 na posição 2
        System.out.println("Lista após adicionar 70 na posição 2:");
        lista.exibirLista();

        // Exibe o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.tamanhoLista());

        // Busca a posição de um elemento (pela frente e pelo fim)
        System.out.println("Posição do elemento 70 (pela frente): " + lista.buscaPosicaoFrente(70));
        System.out.println("Posição do elemento 3 (pela frente): " + lista.buscaPosicaoFrente(3));
        System.out.println("Posição do elemento 3 (pela trás): " + lista.buscaPosicaoTras(3));

        // Remove o primeiro elemento
        lista.removeDoInicio();
        System.out.println("Lista após remover do início:");
        lista.exibirLista();

        // Remove o último elemento
        lista.removeDoFim();
        System.out.println("Lista após remover do fim:");
        lista.exibirLista();

        // Remove o elemento da posição 2
        lista.remove(2);
        System.out.println("Lista após remover da posição 2:");
        lista.exibirLista();

        // Exibe o primeiro e último elemento da lista
        System.out.println("Primeiro elemento: " + lista.primeiroElemento());
        System.out.println("Último elemento: " + lista.ultimoElemento());

        // Percorre a lista do início ao fim e do fim ao início
        System.out.print("Percorrendo do início: ");
        lista.percorreDoInicio();

        System.out.print("Percorrendo do fim: ");
        lista.percorreDoFim();
    }
}
