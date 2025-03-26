package br.com.bruno_dezorzi.criacionais.factory_method;

public class GerenciadorEmail extends Gerenciador{

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }

}
