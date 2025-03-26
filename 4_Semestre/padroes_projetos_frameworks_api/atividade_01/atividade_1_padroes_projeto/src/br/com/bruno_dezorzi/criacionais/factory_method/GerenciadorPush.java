package br.com.bruno_dezorzi.criacionais.factory_method;

public class GerenciadorPush extends Gerenciador{
    
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
