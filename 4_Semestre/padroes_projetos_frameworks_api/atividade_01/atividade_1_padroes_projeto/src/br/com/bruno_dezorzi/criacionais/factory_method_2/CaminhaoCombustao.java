package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class CaminhaoCombustao implements Veiculo {
    @Override
    public void operar() {
        System.out.println("Transportando com um caminhão a combustão.");
    }
}
