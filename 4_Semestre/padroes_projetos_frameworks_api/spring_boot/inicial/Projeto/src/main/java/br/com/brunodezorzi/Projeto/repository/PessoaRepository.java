package br.com.brunodezorzi.Projeto.repository;

import br.com.brunodezorzi.Projeto.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {}
