package criacionais.abstractfactory;

public class FabricaDePlastico implements FabricaDeBrinquedos {

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoPlastico();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoPlastico();
    }

}
