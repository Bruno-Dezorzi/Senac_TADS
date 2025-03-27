package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.List;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco();
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public List<String> getAdicionais() {
        return bebida.getAdicionais();
    }
}
