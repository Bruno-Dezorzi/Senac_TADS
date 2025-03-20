package br.com.bruno_dezorzi.padroes.estruturais.facade;

public class Principal {
    Amplificador amplificador = new Amplificador();
    Projetor projetor = new Projetor();
    Player player = new Player();

    HomeTheater homeTheater = new HomeTheater(amplificador,projetor,player);

    homeTheater.assistirFilme("O Retorno dos pastéis");
}
