package br.com.brunodezorzi.Projeto.controller;

import br.com.brunodezorzi.Projeto.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

  @GetMapping("/produto")
  public Produto produto(
    @RequestParam String nome,
    @RequestParam double preco
  ) {
    Produto produto = new Produto(nome, preco);
    return produto;
  }
}
