package br.com.brunodezorzi.test_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionPessoa {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("br.com.brunodezorzi.Pessoa");

    Constructor<?> construtor = clazz.getConstructor(String.class);

    Object pessoa = construtor.newInstance("Bruno");

    Method method = clazz.getMethod("getNome");
    String nome = (String) method.invoke(pessoa);

    System.out.println("Nome: " + nome);
  }
}
