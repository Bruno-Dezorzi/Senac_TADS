package br.com.bruno_dezorzi.criacionais.factory_method_2;

public class Principal {
    public static void main(String[] args) {
        FabricaVeiculo fabricaCarro = new FabricaCarro();
        FabricaVeiculo fabricaCaminhao = new FabricaCaminhao();
        FabricaVeiculo fabricaMoto = new FabricaMoto();
        
        Veiculo carroEletrico = fabricaCarro.criarVeiculo("eletrico");
        Veiculo carroCombustao = fabricaCarro.criarVeiculo("combustao");

        Veiculo caminhaoEletrico = fabricaCaminhao.criarVeiculo("eletrico");
        Veiculo caminhaoCombustao = fabricaCaminhao.criarVeiculo("combustao");

        Veiculo motoEletrico = fabricaMoto.criarVeiculo("eletrico");
        Veiculo motoCombustao = fabricaMoto.criarVeiculo("combustao");
        
        carroEletrico.operar();
        carroCombustao.operar();
        caminhaoEletrico.operar();
        caminhaoCombustao.operar();
        motoEletrico.operar();
        motoCombustao.operar();
    }
}
