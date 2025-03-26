package br.com.bruno_dezorzi.criacionais.factory_method;

public class NotificacaoSMS implements Notificacao{
    
    @Override
    public void enviar() {
       System.out.println("Notificando com SMS");
    }
}
