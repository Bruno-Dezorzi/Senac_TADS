package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.ArrayList;
import java.util.List;

public class ChocolateQuente implements Bebida{
    @Override
    public double getPreco() {
        return 7.00;
    }

    @Override
    public String getDescricao() {
        return "ChocolateQuente";
    }

    @Override
    public List<String> getAdicionais() {
        return new ArrayList<>();
    }
}
