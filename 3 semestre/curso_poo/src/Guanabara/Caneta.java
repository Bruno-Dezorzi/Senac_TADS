package Guanabara;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void rabiscar(){
        if(tampada){
            System.out.println("ERRO");
        }
        else {
            System.out.println("RABISCO");
        }
    }

    public void tampar(){
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }

    void status(){
        System.out.println("Uma caneta " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Uma caneta " + this.ponta);
        System.out.println("Uma caneta " + this.carga);
        System.out.println("Uma caneta " + this.tampada);

    }

    
}
