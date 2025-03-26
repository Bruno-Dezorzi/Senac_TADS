package br.com.bruno_dezorzi.estruturais.bridge;

import java.util.List;

public class ControleRemotoAvancado extends ControleRemoto{

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public ControleRemotoAvancado(List<Dispositivo> dispositivos){
        super(dispositivos);
    }

    public void silenciar(){
        System.out.println("Dispositivo silenciado");
    }

    public void timerDesligar(){
        System.out.println("Iniciando contagem para desligar o dispositivo");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Dispositivo desligado");

    }
}
