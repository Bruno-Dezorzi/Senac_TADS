package br.com.bruno_dezorzi.padroes.comportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediador {

  private List<Colaborador> colaboradores;

  public MediadorConcreto() {
    this.colaboradores = new ArrayList<>();
  }

  @Override
  public void enviarMensagem(String mensagem, Colaborador remetente) {
    for (Colaborador colaborador : colaboradores) {
      if (colaborador != remetente) {
        colaborador.receberMensagem(mensagem);
      }
    }
  }

  @Override
  public void adicionarColaborador(Colaborador colaborador) {
    colaboradores.add(colaborador);
  }
}
