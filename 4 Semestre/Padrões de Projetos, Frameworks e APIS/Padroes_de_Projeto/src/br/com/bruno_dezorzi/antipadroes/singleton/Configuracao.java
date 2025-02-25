package br.com.bruno_dezorzi.antipadroes.singleton;

public class Configuracao {
    
    public static Configuracao instaciaGlobal = new Configuracao();

    public String configuracaoSistema;

    public Configuracao(){
        configuracaoSistema = "Modo Escuro";
    }
}
