package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class FabricaCarro extends FabricaVeiculo {

    @Override
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("eletrico") || tipo.equalsIgnoreCase("elétrico")) {
            return new CarroEletrico();
        } else if (tipo.equalsIgnoreCase("combustao") || tipo.equalsIgnoreCase("combustão")) {
            return new CarroCombustao();
        }
        throw new IllegalArgumentException("Tipo de carro desconhecido: " + tipo);
    }
}
