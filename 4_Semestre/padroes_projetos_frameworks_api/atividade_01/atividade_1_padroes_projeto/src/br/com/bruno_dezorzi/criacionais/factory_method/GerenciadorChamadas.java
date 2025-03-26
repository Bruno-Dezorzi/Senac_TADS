package br.com.bruno_dezorzi.criacionais.factory_method;

public class GerenciadorChamadas extends Gerenciador{

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoChamada();
    }

}
