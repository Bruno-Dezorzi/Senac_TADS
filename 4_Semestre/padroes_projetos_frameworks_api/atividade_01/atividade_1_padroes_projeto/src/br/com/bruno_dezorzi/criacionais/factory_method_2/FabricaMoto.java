package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class FabricaMoto extends FabricaVeiculo{
    @Override
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("eletrico") || tipo.equalsIgnoreCase("elétrico")) {
            return new MotoEletrica();
        } else if (tipo.equalsIgnoreCase("combustao") || tipo.equalsIgnoreCase("combustão")) {
            return new MotoCombustao();
        }
        throw new IllegalArgumentException("Tipo de Moto desconhecido: " + tipo);
    }
}
