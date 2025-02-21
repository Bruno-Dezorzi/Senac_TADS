package br.com.bruno_dezorzi.antipadroes.factorymethod;

public class Logistica {

    private Caminhao caminhao;
    private Trem trem;

    public Logistica() {
        this.caminhao = new Caminhao();
        this.trem = new Trem();
    }

    public void planejarEntrega(String tipo) {
        System.out.println("Planejando entrega..");

        if (tipo.equals("caminhao")) {
            caminhao.entregar();
        } else if (tipo.equals("trem")) {
            trem.entregar();
        } else {
            System.out.println("Tipo de transporte desconhecido");
        }
    }
}
