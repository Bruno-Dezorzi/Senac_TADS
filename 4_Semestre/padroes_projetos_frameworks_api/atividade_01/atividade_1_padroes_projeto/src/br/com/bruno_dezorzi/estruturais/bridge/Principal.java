package br.com.bruno_dezorzi.estruturais.bridge;

public class Principal {
    public static void main(String[] args) {
        Dispositivo tv = new Tv();
        Dispositivo radio = new Radio();
        Dispositivo projetor = new Projetor();

        ControleRemotoBasico controleRemotoBasicoRadio = new ControleRemotoBasico(radio);
        ControleRemotoAvancado controleRemotoAvancadoTV = new ControleRemotoAvancado(tv);
        ControleRemotoAvancado controleRemotoAvancadoProjetor = new ControleRemotoAvancado(projetor);

       // controleRemotoAvancado.adicionarControle(projetor);

       controleRemotoBasicoRadio.ligar();
       controleRemotoBasicoRadio.aumentarVolume();
       controleRemotoBasicoRadio.desligar();

       controleRemotoAvancadoTV.ligar();
       controleRemotoAvancadoTV.aumentarVolume();
       controleRemotoAvancadoTV.silenciar();
       controleRemotoAvancadoTV.timerDesligar();

       controleRemotoAvancadoProjetor.ligar();
       controleRemotoAvancadoProjetor.aumentarVolume();
       controleRemotoAvancadoProjetor.silenciar();
       controleRemotoAvancadoProjetor.timerDesligar();
    }
}
