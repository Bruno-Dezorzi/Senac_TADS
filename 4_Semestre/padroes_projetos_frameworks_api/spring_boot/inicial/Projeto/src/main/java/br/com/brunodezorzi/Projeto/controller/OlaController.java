package br.com.brunodezorzi.Projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

  @GetMapping("/ola")
  public String ola() {
    return "Olá, Spring boot";
  }

  @GetMapping("/saudacao")
  public String saudacao(@RequestParam String nome) {
    return String.format("Olá %s", nome);
  }

  @GetMapping("/")
  public String home() {
    return String.format("Olá Mundo!");
  }
}
