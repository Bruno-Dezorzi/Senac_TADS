package br.com.brunodezorzi.poo.julho.atv2;

public class Principal {

    public static void main(String[] args) {
        Padaria minhapadaria = new Padaria();

        Bolo bolo1 = new Bolo("Chocolate","Grande",19.99);

        Pao pao1 = new Pao("Francês", 0.5, 1.99);


        minhapadaria.adicionarBolo(bolo1);
        minhapadaria.adicionarPaes(pao1);

        minhapadaria.relatorioBolos();
        minhapadaria.relatorioPaes();
    }

}
