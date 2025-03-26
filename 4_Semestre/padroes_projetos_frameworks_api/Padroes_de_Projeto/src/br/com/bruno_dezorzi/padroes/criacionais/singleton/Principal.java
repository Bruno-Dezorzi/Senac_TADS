package br.com.bruno_dezorzi.padroes.criacionais.singleton;

public class Principal {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        
        singleton1.mostrarMensagem();

        if (singleton1 == singleton2) {
            System.out.println("As instancias são iguais");
            
        }else{
            System.out.println("As instancias são diferentes");
        }
    }
}
