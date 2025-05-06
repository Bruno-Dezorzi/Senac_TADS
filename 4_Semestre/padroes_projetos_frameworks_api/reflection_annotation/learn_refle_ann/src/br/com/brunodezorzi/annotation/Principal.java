package br.com.brunodezorzi.annotation;

import java.lang.reflect.Method;

public class Principal {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("br.com.brunodezorzi.annotation.Exemplo");
    Method method = clazz.getMethod("testar");
    MinhasInfo info = method.getAnnotation(MinhasInfo.class);
    System.out.println("Autor: " + info.author());
  }
}
