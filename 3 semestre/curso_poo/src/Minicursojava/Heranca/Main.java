package Minicursojava.Heranca;

public class Main {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(300);
        ContaCorrente contaCorrente = new ContaCorrente();

        contaPoupanca.view();
        contaCorrente.view();
    }
}
