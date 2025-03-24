package teste;

import vetores.VetString;

public class TestVetString {
    public static void main(String[] args) {
        // criando um objeto
        VetString vet = new VetString(5);
        // Adicionando os valores
        vet.adiciona("OI");
        vet.adiciona("TCHAU");
        vet.adiciona("BILLIEN JEAN");
        vet.adiciona("ZÉ DA MANGA");
        // Mostrando a quantidade de elementos que são diferentes de zero
        vet.mostrarQuantidade();
        // Mostrando o vetor
        vet.mostrarVetor();
        System.out.println();
        // Usando o método busca para encotrar um valor conforme seu valor kk
        System.out.println(vet.buscaValor("TCHAU"));;
        // Usando o método para encontrar o valor dentro de um vetor conforme sua posição no mesmo;
        System.out.println(vet.busca(3));
        // Usando o aumentaCapacidade()
        vet.aumentarCapacidade(7);
        System.out.println("A capacidade do vetor agora é de: " + vet.getCapacidade());
        // Usando o metodo de remover por posição e mostrando o vetor
        vet.removerValor(0);
        vet.mostrarVetor();
        //
        vet.addPosicao("BRUNO", 0);
        System.out.println();
        vet.mostrarVetor();

       // System.out.println(vet.getQuantidade());



    }
}
