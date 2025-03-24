package teste;

import vetores.Vetor;

public class TestVetor {


    public static void main(String[] args) {
       /* // criando um objeto
        Vetor vet = new Vetor(5);
        // Adicionando os valores
        vet.adiciona(1);
        vet.adiciona(2);
        vet.adiciona(3);
        vet.adiciona(5);
        // Mostrando a quantidade de elementos que são diferentes de zero
        vet.mostrarQuantidade();
        // Mostrando o vetor;
        vet.mostrarVetor();
        System.out.println();
        // Usando o método busca para encotrar um valor conforme seu valor kk
        System.out.println(vet.buscaValor(3));;
        // Usando o método para encontrar o valor dentro de um vetor conforme sua posição no mesmo;
        System.out.println(vet.busca(3));
        // Usando o aumentaCapacidade()
        vet.aumentarCapacidade(7);
        System.out.println("A capacidade do vetor agora é de: " + vet.getCapacidade());
        // Usando o metodo de remover por posição e mostrando o vetor
        vet.removerValor(0);
        vet.mostrarVetor();
        //
        vet.adicionarPosicao(3,7);
        System.out.println();
        vet.mostrarVetor();

       // System.out.println(vet.getQuantidade());
        */
        ///////////////////////////////////////////////////
        Vetor vet = new Vetor(5);
        // Adicionando os valores
        vet.adiciona(5);
        vet.adiciona(6);
        vet.adiciona(2);
        vet.adiciona(7);

        vet.mostrarVetor();
        vet.ordernarbOlha();
        System.out.println();
        vet.mostrarVetor();


    }
}
