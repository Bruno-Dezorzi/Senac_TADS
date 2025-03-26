package br.com.bruno_dezorzi.antipadroes.comportamentais.chainofresponsability;

public class ProcessarPagamento {

    public void processarPagamento(String usuario, double valor){

        //verifica se o valor do pagamento é valido
        if(valor <= 0){
            System.out.println("Erro: o valor do pagamento dever ser maior que zero");
            return;
        }

        // verifica saldo do usuario
        if(!verificarSaldo(usuario, valor)){
            System.out.println("Erro Saldo insuficiente para " + usuario);
            return;
        }

        //verifica limite do usuario
        if(!verificarLimite(usuario, valor)){
            System.out.println("Erro: Pagamento excede o limite para " + usuario);
            return;
        }

        if(!bancoDisponivel()){
            System.out.println("Erro: Banco indisponivel para transações");
            return;
        }
    }

    private boolean verificarSaldo(String usuario, double valor){
        return valor <= 1000;
    }

    private boolean verificarLimite(String usuario, double valor){
        return valor <= 500;
    }

    private boolean bancoDisponivel(){
        return true;
    }
}
