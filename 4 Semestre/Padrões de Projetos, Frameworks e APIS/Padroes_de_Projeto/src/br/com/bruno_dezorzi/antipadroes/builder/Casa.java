package br.com.bruno_dezorzi.antipadroes.builder;

public class Casa {

    private String parede;
    private String telhado;
    private int portas;
    private int janelas;


    public Casa(String parede, String telhado, int portas, int janelas) {
        this.parede = parede;
        this.telhado = telhado;
        this.portas = portas;
        this.janelas = janelas;
    }

    public void mostrarDetalhes() {
        System.out.println("Casa com " + parede + ", " + telhado + ", " + 
                           "Janelas: " + janelas + ", Portas: " + portas);
    }
    
}
