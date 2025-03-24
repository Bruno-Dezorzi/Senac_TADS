package Minicursojava.Heranca;

public class Conta {
    private Integer valor;

    public Conta(){
        
    }

    public Conta(Integer valor){
        this.valor = valor;
    }


    public void view(){
        System.out.println(this.valor);
    }

}
