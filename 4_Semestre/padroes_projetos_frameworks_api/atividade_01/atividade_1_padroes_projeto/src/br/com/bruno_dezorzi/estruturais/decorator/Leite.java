package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.List;

public class Leite extends  BebidaDecorator{
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public List<String> getAdicionais() {
        List<String> adicionais = bebida.getAdicionais();
        adicionais.add("Leite");
        return adicionais;
    }
}
