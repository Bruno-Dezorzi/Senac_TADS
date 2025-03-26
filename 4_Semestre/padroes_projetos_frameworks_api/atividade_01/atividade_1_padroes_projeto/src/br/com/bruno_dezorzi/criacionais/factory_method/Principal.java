package br.com.bruno_dezorzi.criacionais.factory_method;

public class Principal {
    public static void main(String[] args) {
        Gerenciador gerenciadorEmail = new GerenciadorEmail();
        gerenciadorEmail.gerenciarNotificacoes();

        Gerenciador gerenciadorSMS = new GerenciadorSMS();
        gerenciadorSMS.gerenciarNotificacoes();

        Gerenciador gerenciadorPush = new GerenciadorPush();
        gerenciadorPush.gerenciarNotificacoes();

        Gerenciador gerenciadorChamada = new GerenciadorChamadas();
        gerenciadorChamada.gerenciarNotificacoes();
    }
}
