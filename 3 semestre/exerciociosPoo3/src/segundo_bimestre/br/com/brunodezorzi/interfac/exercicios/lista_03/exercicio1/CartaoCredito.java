/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_03.exercicio1;

/**
 *
 * @author HP Victus
 */
public class CartaoCredito implements IPagamento {
    private String status;
    private float numero = 1000;

    @Override
    public boolean autorizarPagamento(float valor) {
        if(valor > numero){
            status = "Autorizado";
            return true;
            
        }
        else{
            status = "Falha";
            return false;
        }
    }

    @Override
    public boolean capturarPagamento() {
        if("Autorizado".equals(status)){
            status = "Capturado";
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean estornarPagamento(float valor) {
        if ("Capturado".equals(status) && valor > numero) {
            status = "Estornado";
            return true;
        }
        return false;
    }

    @Override
    public String getStatus() {
        return status;
    }
    
    public void mensagemAceitacao(){
        System.out.println("Só valores acima de " + numero + " reais");
    }
    
}
