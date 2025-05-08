package br.com.brunodezorzi.Projeto.controller;

import br.com.brunodezorzi.Projeto.model.Pessoa;
import br.com.brunodezorzi.Projeto.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

  @Autowired
  PessoaRepository pessoaRepository;

  @GetMapping("/ola")
  public String ola() {
    return "Olá, Spring boot";
  }

  @GetMapping("/saudacao")
  public String saudacao(@RequestParam String nome) {
    return String.format("Olá %s", nome);
  }

  @GetMapping("/pessoa")
  public Pessoa pessoa() {
    Pessoa p = new Pessoa(21, "Bruno Dezorzi");
    pessoaRepository.save(p);
    return p;
  }
}
