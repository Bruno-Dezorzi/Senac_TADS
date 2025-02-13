package br.com.brunodezorzi.poo.agosto.exercicio6;

public class Tabuada {
    private int numero;

    public Tabuada(int numero) {
        this.numero = numero;
    }

    public Tabuada(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

}
