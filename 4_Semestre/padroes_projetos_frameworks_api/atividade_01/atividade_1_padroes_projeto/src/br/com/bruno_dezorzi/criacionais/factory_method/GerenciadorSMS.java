package br.com.bruno_dezorzi.criacionais.factory_method;

public class GerenciadorSMS extends Gerenciador{
    
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
