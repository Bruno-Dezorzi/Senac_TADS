package br.com.bruno_dezorzi.estruturais.decorator;

public class Principal {
    public static void main(String[] args) {

        Bebida bebida = new Cafe();
        System.out.println(bebida.getDescricao() + " - R$ " + bebida.getPreco());

        bebida = new Leite(bebida);
        bebida = new Chantilly(bebida);
        bebida = new Caramelo(bebida);
        
        System.out.println(bebida.getDescricao() + " - R$ " + bebida.getPreco());
        System.out.println("Preço final: R$ " + bebida.getPreco());


        Bebida bebida2 = new ChocolateQuente();
        System.out.println(bebida2.getDescricao() + " - R$ " + bebida2.getPreco());


        bebida2 = new Chantilly(bebida2);
        
        System.out.println(bebida2.getDescricao() + " - R$ " + bebida2.getPreco());
        System.out.println("Preço final: R$ " + bebida2.getPreco());
    }
}
