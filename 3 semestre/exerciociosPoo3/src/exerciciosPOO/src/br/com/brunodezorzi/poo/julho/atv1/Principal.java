package br.com.brunodezorzi.poo.julho.atv1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Marca marca1 = new Marca("Toyota");
        Modelo modelo1 = new Modelo("Corolla", marca1);
        List<String> opcionais = new ArrayList<>();
        opcionais.add("Ar-Condicionado");
        opcionais.add("Teto Solar");
        Carro carro1 = new Carro(modelo1,"yellow","Sedan",4,"1.0 Turbo",opcionais);
        carro1.imprimirRelatorio();
    }
}
