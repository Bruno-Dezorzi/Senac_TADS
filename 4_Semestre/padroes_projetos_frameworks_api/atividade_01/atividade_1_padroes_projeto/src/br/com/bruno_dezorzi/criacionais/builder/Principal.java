package br.com.bruno_dezorzi.criacionais.builder;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Personagem mago = new PersonagemBuilder()
        .magoSupremo("Gandalf","Mago")
        .adicionarArma("Espada Martelo do Rei")
        .build();
        
        Personagem ranger = new PersonagemBuilder()
        		.setNome("Aragorn")
        		.setClasse("Ranger")
        		.adicionarArmas(Arrays.asList("Anduril","Arco"))
        		.adicionarHabilidade("Cura")
        		.build();
        
        Personagem guerreiro_anao = new PersonagemBuilder()
        		.setNome("Gimli")
        		.setClasse("Guerreiro")
        		.adicionarArma("Machado")
        		.build();

        System.out.println(mago.toString());
        System.out.println(ranger.toString()); 
        System.out.println(guerreiro_anao.toString()); 

    }
}
