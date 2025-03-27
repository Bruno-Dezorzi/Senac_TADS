package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.List;

public class Chocolate extends BebidaDecorator{
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.00;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chocolate";
    }

    @Override
    public List<String> getAdicionais() {
        List<String> adicionais = bebida.getAdicionais();
        adicionais.add("Chocolate");
        return adicionais;
    }
}
