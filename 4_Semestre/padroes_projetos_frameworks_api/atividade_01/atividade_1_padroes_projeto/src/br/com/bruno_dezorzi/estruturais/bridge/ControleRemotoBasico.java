package br.com.bruno_dezorzi.estruturais.bridge;

import java.util.List;

public class ControleRemotoBasico extends ControleRemoto {
    public ControleRemotoBasico(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public ControleRemotoBasico(List<Dispositivo> dispositivos) {
        super(dispositivos);
    }
}
