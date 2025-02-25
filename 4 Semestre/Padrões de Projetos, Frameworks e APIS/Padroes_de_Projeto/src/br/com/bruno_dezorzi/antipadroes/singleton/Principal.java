package br.com.bruno_dezorzi.antipadroes.singleton;

public class Principal {

    public static void main(String[] args) {
        Configuracao config1 = new Configuracao();
        Configuracao config2 = new Configuracao();

        config1.configuracaoSistema = "Modo Claro";

        System.out.println(config1.configuracaoSistema);
        System.out.println(config2.configuracaoSistema);

    }
}
