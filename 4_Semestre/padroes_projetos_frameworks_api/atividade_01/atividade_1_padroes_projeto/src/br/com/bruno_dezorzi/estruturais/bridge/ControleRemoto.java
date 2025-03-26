package br.com.bruno_dezorzi.estruturais.bridge;

import java.util.List;

public class ControleRemoto {
    protected Dispositivo dispositivo;
    protected List<Dispositivo> dispositivos;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public ControleRemoto(List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void adicionarControle(Dispositivo controle) {
        if (dispositivos != null) {
            dispositivos.add(controle);
        }
    }

    public void ligar() {
        if (dispositivo != null) {
            dispositivo.ligar();
        }
    }

    public void desligar() {
        if (dispositivo != null) {
            dispositivo.desligar();
        }
    }

    public void aumentarVolume() {
        if (dispositivo != null) {
            dispositivo.aumentarVolume();
        }
    }

    public void diminuirVolume() {
        if (dispositivo != null) {
            dispositivo.diminuirVolume();
        }
    }
}
