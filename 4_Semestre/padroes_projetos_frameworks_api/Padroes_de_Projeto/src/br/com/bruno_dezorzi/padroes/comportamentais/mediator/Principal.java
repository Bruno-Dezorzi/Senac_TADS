package br.com.bruno_dezorzi.padroes.comportamentais.mediator;

public class Principal {

  public static void main(String[] args) {
    Mediador mediador = new MediadorConcreto();

    Colaborador colaborador1 = new ColaboradorConcreto(mediador, "Guilherme");
    Colaborador colaborador2 = new ColaboradorConcreto(mediador, "Erico");
    Colaborador colaborador3 = new ColaboradorConcreto(mediador, "Matheus");

    colaborador1.enviarMensagem("Ola a todos");
    colaborador2.enviarMensagem("Oi, Guilherme");
    colaborador3.enviarMensagem("Ola pessoal");
  }
}
