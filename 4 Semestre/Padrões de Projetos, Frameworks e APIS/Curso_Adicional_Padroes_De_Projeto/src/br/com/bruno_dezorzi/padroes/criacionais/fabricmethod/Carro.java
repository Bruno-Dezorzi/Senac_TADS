package br.com.bruno_dezorzi.padroes.criacionais.fabricmethod;

public class Carro implements Veiculo{
    @Override
    public void dirigir() {
        System.out.println("Dirigindo carro");
    }
}
