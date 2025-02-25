package br.com.bruno_dezorzi.padroes.criacionais.singleton;

public class Singleton {
    private static Singleton instancia;

    private Singleton(){

    }

    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }

        return instancia;
    }

    public void mostrarMensagem(){
        System.out.println("Mensagem da instancia Singleton");
    }
}
