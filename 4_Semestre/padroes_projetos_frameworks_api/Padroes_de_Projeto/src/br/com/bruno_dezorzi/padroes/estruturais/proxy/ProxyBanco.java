package br.com.bruno_dezorzi.padroes.estruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyBanco implements ServicoBanco {

    private Banco bancoVerdadeiro = new Banco();
    private final Map<String, Double> saldoClientes = new HashMap<>();
    private final Map<String, Boolean> cartaoAtivo = new HashMap<>();

    public ProxyBanco(){
        saldoClientes.put("João", 100.00);
        saldoClientes.put("Maria", 550.00);
        cartaoAtivo.put("João", true);
        cartaoAtivo.put("Maria", false);
    }

    @Override
    public void processarPagamento(String cliente, double valor) {
        if (!cartaoAtivo.get(cliente)) {
            System.out.println("Proxy: Transação negada! Cartão de " + cliente + " está inativo");
            return;
        }

        double saldo = saldoClientes.get(cliente);
        if (saldo < valor) {
            System.out.println("Proxy: Transação negada! Saldo insuficiente para " + cliente);
            return;
        }

        bancoVerdadeiro.processarPagamento(cliente, valor);
        saldoClientes.put(cliente, saldo - valor);
        System.out.println("Proxy: Pagamento de R$" + valor + " processado para " + cliente);
    }
}
