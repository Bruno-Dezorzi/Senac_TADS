/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.polimorfismo;

/**
 *
 * @author HP Victus
 */
public class Mensagem {
    public void enviar(String msg){
        System.out.println(msg);
        
    }
    
    public void enviar(String msg, int tempo){
        System.out.println(msg);
    }
    
    public void enviar(String msg, int tempo, String destinatario, String remetente){
        System.out.println(msg);
    }
}
