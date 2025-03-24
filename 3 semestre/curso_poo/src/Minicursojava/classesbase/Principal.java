package Minicursojava.classesbase;

public class Principal {

    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(carro.getLigado());
        carro.ligarCarro();
        System.out.println(carro.getLigado());
        carro.desligarCarro();
        System.out.println(carro.getLigado());
    }
}
