package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class FabricaCaminhao extends FabricaVeiculo{

    @Override
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("eletrico") || tipo.equalsIgnoreCase("elétrico")) {
            return new CaminhaoEletrico();
        } else if (tipo.equalsIgnoreCase("combustao") || tipo.equalsIgnoreCase("combustão")) {
            return new CaminhaoCombustao();
        }
        throw new IllegalArgumentException("Tipo de Caminhao desconhecido: " + tipo);
    }
}
