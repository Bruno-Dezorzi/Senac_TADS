package br.com.bruno_dezorzi.padroes.criacionais.fabricmethod;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = VeiculoFactory.criarVeiculo("carro");
        carro.dirigir();

        Veiculo moto = VeiculoFactory.criarVeiculo("moto");
        moto.dirigir();
    }
}
