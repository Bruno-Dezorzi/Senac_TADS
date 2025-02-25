package br.com.bruno_dezorzi.antipadroes.builder;

public class Principal {

    public static void main(String[] args) {
        Casa casa = new Casa("Parede Tijolo", "Telhado de madeira", 4, 10);

        casa.mostrarDetalhes();
    }
}
