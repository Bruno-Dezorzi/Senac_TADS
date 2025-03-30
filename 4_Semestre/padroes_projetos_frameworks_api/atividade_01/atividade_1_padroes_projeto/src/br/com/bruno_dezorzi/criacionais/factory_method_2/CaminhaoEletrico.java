package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class CaminhaoEletrico implements Veiculo {
    @Override
    public void operar() {
        System.out.println("Transportando com um caminhão elétrico.");
    }
}
