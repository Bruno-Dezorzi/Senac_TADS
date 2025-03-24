package teste;

import vetores.Vetor;

public class TestAumenta {

    public static void main(String[] args) {
        Vetor vet = new Vetor(5);
        vet.adiciona(1);
        vet.adiciona(10);
        vet.adiciona(20);
        vet.adiciona(30);
        vet.adiciona(50);

        vet.mostrarVetor();

        System.out.println();

        vet.aumentarCapacidade(10);

        vet.adiciona(1);
        vet.adiciona(10);
        vet.adiciona(20);
        vet.adiciona(30);
        vet.adiciona(50);

        vet.mostrarVetor();



    }


}
