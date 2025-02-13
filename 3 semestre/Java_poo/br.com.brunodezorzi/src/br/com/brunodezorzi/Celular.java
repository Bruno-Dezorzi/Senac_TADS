package br.com.brunodezorzi;

public class Celular {

    private String cor;
    private String tecnologia;
    private float peso;
    private float largura;
    private float altura;


    public void ligar(){
        System.out.println("Ligando...");
    }

    public void baterFoto(){
        System.out.println("Batendo foto...");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "Celular{" +
                "cor='" + cor + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", peso=" + peso +
                ", largura=" + largura +
                ", altura=" + altura +
                '}';
    }


}
