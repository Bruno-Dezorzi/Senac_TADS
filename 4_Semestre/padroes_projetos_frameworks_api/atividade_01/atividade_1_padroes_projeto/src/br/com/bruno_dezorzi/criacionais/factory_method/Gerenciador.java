package br.com.bruno_dezorzi.criacionais.factory_method;

public abstract class Gerenciador {

    public abstract Notificacao criarNotificacao();

    public void gerenciarNotificacoes(){
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
