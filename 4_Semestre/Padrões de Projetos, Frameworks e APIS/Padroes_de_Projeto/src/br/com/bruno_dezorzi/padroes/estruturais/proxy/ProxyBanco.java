package br.com.bruno_dezorzi.padroes.estruturais.proxy;

import java.util.HashMap;

public class ProxyBanco implements ServicoBanco {

    private  Banco bancoVerdadeiro = new Banco();
    private Map<String,double> saldoClientes = new HashMap<>();
    private Map<String,Boolean> cartaoAtivo = new HashMap<>();

    public ProxyBanco(){
        saldoClientes.put("João", 100.00);
        saldoClientes.put("Maria", 550.00);
        cartaoAtivo.put("João", true);
        cartaoAtivo.put("Maria", false);
    }


    @Override
  public void processarPagamento(String cliente, double valor) {
    if(!cartaoAtivo.get(cliente)){
        System.out.println("Proxy: Transação negada! Cartão de " + cliente + " está inativo");
    }

    double saldo = saldoClientes.get(cliente);
    if(saldo < valor){
        System.out.println("Proxy: Transação negada! Saldo insuficiente para" + cliente );
    }

    bancoVerdadeiro.processarPagamento(cliente, valor);
    saldoClientes.put(cliente,saldo - valor);
  }

}
