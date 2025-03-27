package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.List;

public class Chantilly extends  BebidaDecorator{
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.5;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    @Override
    public List<String> getAdicionais() {
        List<String> adicionais = bebida.getAdicionais();
        adicionais.add("Chantilly");
        return adicionais;
    }
}
