package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.List;

public interface Bebida {
    double getPreco();
    String getDescricao();
    List<String> getAdicionais();
}
