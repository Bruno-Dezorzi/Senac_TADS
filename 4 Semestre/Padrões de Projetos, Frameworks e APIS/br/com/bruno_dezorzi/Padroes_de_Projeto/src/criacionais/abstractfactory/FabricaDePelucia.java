package criacionais.abstractfactory;

public class FabricaDePelucia implements FabricaDeBrinquedos {

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoPelucia();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoPelucia();
    }

    @Override
    public Tartaruga criarTartaruga() {
        return new TartaturaDePelucia();
    }

}
