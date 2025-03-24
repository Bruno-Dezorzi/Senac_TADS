package teste;

import modelo.Contato;
import vetores.VetorObject;

public class TesteVetorObject {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);

        Contato c1 = new Contato("Luke Skywalker", "9999-9999");
        Contato c2 = new Contato("Darth Vader" , "1111-1111");
        Contato c3 = new Contato("Han Solo","8888-8888");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        vetor.mostrarVetor();
    }
}
