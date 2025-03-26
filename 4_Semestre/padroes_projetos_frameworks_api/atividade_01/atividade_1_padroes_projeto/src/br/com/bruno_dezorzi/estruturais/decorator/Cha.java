package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.ArrayList;
import java.util.List;

public class Cha implements Bebida{
    @Override
    public double getPreco() {
        return 3.00;
    }

    @Override
    public String getDescricao() {
        return "Cha";
    }

    @Override
    public List<String> getAdicionais() {
        return new ArrayList<>();
    }
}
