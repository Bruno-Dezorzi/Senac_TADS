package br.com.bruno_dezorzi.padroes.criacionais.abstractfactory;

public class Main {

    public static void main(String[] args) {
        FabricaDeBrinquedos fabricaPelucia = new FabricaDePelucia();
        Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
        Ursinho ursinhoPelucia = fabricaPelucia.criarUrsinho();
        Tartaruga tartarugaPelucia = fabricaPelucia.criarTartaruga();

        FabricaDeBrinquedos fabricaPlastico = new FabricaDePlastico();
        Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
        Ursinho ursinhoPlastico = fabricaPlastico.criarUrsinho();
        Tartaruga tartarugaDePlastico = fabricaPlastico.criarTartaruga();

        coelhoPlastico.exibir();
        ursinhoPlastico.exibir();
        tartarugaDePlastico.exibir();

        coelhoPelucia.exibir();
        ursinhoPelucia.exibir();
        tartarugaPelucia.exibir();

    }

}
