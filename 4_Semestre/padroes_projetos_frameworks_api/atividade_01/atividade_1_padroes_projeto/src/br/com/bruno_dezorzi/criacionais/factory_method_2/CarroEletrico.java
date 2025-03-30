package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class CarroEletrico implements Veiculo {
    @Override
    public void operar() {
        System.out.println("Dirigindo um carro elétrico.");
    }
}