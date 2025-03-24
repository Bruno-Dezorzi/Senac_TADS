package aulas.heap_sort16;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Populando o vetor com números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Construindo o heap (reorganizando o array)
        int n = vetor.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        System.out.println("Quase Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Extraindo elementos do heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz (maior elemento) para o final
            int aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;

            // Reaplica o heap na árvore reduzida
            aplicarHeap(vetor, i, 0);
        }

        System.out.println("Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int maior = i;           // Inicializa o maior como a raiz
        int esquerda = 2 * i + 1; // Filho à esquerda
        int direita = 2 * i + 2;  // Filho à direita

        // Se o filho da esquerda for maior que a raiz
        if (esquerda < n && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }

        // Se o filho da direita for maior que a maior raiz até agora
        if (direita < n && vetor[direita] > vetor[maior]) {
            maior = direita;
        }

        // Se a maior não for a raiz
        if (maior != i) {
            int aux = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = aux;

            // Recursivamente aplica o heap na subárvore afetada
            aplicarHeap(vetor, n, maior);
        }
    }
}
