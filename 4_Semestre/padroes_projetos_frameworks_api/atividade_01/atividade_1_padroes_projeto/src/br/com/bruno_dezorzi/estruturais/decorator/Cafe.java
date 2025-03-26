package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.ArrayList;
import java.util.List;

public class Cafe implements Bebida{

    @Override
    public double getPreco() {
        return 5.00;
    }

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public List<String> getAdicionais() {
        return new ArrayList<>();
    }

}
