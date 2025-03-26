package br.com.bruno_dezorzi.padroes.criacionais.fabricmethod;

public class VeiculoFactory {
    public static Veiculo criarVeiculo(String tipo){
        if("carro".equals(tipo)){
            return new Carro();
        }else if("moto".equals(tipo)){
            return new Moto();
        }
        throw new IllegalArgumentException("Tipo de veículo desconhecido");
    }
}
