package br.com.bruno_dezorzi.padroes.comportamentais.memento;

public class Principal {

  public static void main(String[] args) {
    EditorTexto editor = new EditorTexto();
    Historico historico = new Historico();

    editor.escrever("OLAAAAAAAAAA");
    historico.salvarMemento(editor.salvar());

    editor.escrever(
      "MUNDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
    );
    historico.salvarMemento(editor.salvar());

    editor.escrever(" Este é um editor de text.");

    System.out.println("Texto atual: " + editor.mostrarTexto());

    editor.desfazer(historico.desfazer());
    System.out.println("Após desfazer " + editor.mostrarTexto());

    editor.desfazer(historico.desfazer());
    System.out.println("Após desfazer novamente" + editor.mostrarTexto());
  }
}
