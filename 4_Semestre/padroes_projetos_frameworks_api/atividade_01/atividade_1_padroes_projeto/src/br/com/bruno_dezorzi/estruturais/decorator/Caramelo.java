package br.com.bruno_dezorzi.estruturais.decorator;

import java.util.List;

public class Caramelo extends BebidaDecorator{
    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.25;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Caramelo";
    }

    @Override
    public List<String> getAdicionais() {
        List<String> adicionais = bebida.getAdicionais();
        adicionais.add("Caramelo");
        return adicionais;
    }
}
