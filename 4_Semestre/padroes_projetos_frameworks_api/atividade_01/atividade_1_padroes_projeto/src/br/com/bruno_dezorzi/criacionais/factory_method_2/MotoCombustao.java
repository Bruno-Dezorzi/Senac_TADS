package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class MotoCombustao implements Veiculo{
    @Override
    public void operar() {
        System.out.println("Dirigindo com um moto a combustão.");
    }
}
